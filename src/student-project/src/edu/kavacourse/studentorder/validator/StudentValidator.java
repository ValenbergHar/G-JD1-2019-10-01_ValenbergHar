package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerStudent;
import edu.kavacourse.studentorder.domain.AnswerWedding;
import edu.kavacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerStudent();
    }
}
