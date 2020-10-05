package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.AnswerChildren;
import edu.kavacourse.studentorder.domain.AnswerWedding;
import edu.kavacourse.studentorder.domain.StudentOrder;

public class WeddingValidator
{
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }
}