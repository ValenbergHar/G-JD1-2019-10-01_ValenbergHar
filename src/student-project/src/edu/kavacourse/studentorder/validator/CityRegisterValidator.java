package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerCityRegister;
import edu.kavacourse.studentorder.domain.Child;
import edu.kavacourse.studentorder.domain.Person;
import edu.kavacourse.studentorder.register.AnswerCityRegisterItem;
import edu.kavacourse.studentorder.register.CityRegisterCheckerResponse;
import edu.kavacourse.studentorder.domain.StudentOrder;
import edu.kavacourse.studentorder.exception.CityRegisterException;
import edu.kavacourse.studentorder.validator.register.FakeCityRegisterChecker;

import java.util.List;

public class CityRegisterValidator {

    private FakeCityRegisterChecker personChecker;
    String hostName;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        AnswerCityRegister ans = new AnswerCityRegister();
        checkPerson(so.getHusband());
        checkPerson(so.getWife());
            for (Child child: so.getChildren()) {
                checkPerson(child);
            }

        return ans;
    }
    private AnswerCityRegisterItem checkPerson (Person person){
        try {
            CityRegisterCheckerResponse hans = personChecker.checkPerson(child);
        }catch (CityRegisterException ex){
            ex.printStackTrace();
        }
    }
}
