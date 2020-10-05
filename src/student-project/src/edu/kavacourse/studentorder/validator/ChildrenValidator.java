package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerChildren;
import edu.kavacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children Check is running");
        return new AnswerChildren();
    }
}
