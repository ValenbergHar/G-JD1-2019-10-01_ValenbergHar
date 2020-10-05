package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerCityRegister;
import edu.kavacourse.studentorder.domain.Child;
import edu.kavacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.kavacourse.studentorder.domain.StudentOrder;
import edu.kavacourse.studentorder.exception.CityRegisterException;

import java.util.List;

public class CityRegisterValidator {

    private FakeCityRegisterChecker personChecker;
    String hostName;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        try {
            CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());

            List<Child> children = so.getChildren();
            for (int i = 0; i < children.size(); i++) {
                CityRegisterCheckerResponse cans = personChecker.checkPerson(children.get(i));
            }

        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
