package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerCityRegister;
import edu.kavacourse.studentorder.domain.Child;
import edu.kavacourse.studentorder.domain.Person;
import edu.kavacourse.studentorder.exception.TransportException;
import edu.kavacourse.studentorder.register.AnswerCityRegisterItem;
import edu.kavacourse.studentorder.register.CityRegisterResponse;
import edu.kavacourse.studentorder.domain.StudentOrder;
import edu.kavacourse.studentorder.exception.CityRegisterException;
import edu.kavacourse.studentorder.validator.register.FakeCityRegisterChecker;

public class CityRegisterValidator {

    private static final String IN_CODE = "NO_GRN";

    private FakeCityRegisterChecker personChecker;
    String hostName;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.addItem(checkPerson(so.getHusband()));
        ans.addItem(checkPerson(so.getWife()));
        for (Child child : so.getChildren()) {
            ans.addItem(checkPerson(child));
        }

        return ans;
    }

    private AnswerCityRegisterItem checkPerson(Person person) {
        AnswerCityRegisterItem.CityStatus status= null;
        AnswerCityRegisterItem.CityError error = null;
        try {
            CityRegisterResponse tmp = personChecker.checkPerson(person);
            status = tmp.isExisting() ? AnswerCityRegisterItem.CityStatus.YES : AnswerCityRegisterItem.CityStatus.NO;
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError(ex.getCode(), ex.getMessage());
        }catch (TransportException ex) {
            ex.printStackTrace();
            status = AnswerCityRegisterItem.CityStatus.ERROR;
            error = new AnswerCityRegisterItem.CityError( IN_CODE, ex.getMessage());
        }
        AnswerCityRegisterItem ans = new AnswerCityRegisterItem(person, status, error);
        return ans;
    }
}
