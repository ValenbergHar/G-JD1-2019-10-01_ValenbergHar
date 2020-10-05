package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerCityRegister;
import edu.kavacourse.studentorder.domain.StudentOrder;

public class CityRegisterValidator {
    String hostName;
     public static AnswerCityRegister checkCityRegister(StudentOrder so) {
         AnswerCityRegister ans = new AnswerCityRegister();
         ans.success=false;
         return ans;
    }
}
