package edu.kavacourse.studentorder;

import edu.kavacourse.studentorder.domain.*;
import edu.kavacourse.studentorder.mail.MailSender;
import edu.kavacourse.studentorder.validator.ChildrenValidator;
import edu.kavacourse.studentorder.validator.CityRegisterValidator;
import edu.kavacourse.studentorder.validator.StudentValidator;
import edu.kavacourse.studentorder.validator.WeddingValidator;

public class StudentOrderValidator {
    private CityRegisterValidator cityRegisterValidator;
    private WeddingValidator weddingValidator;
    private ChildrenValidator childrenVal;
    private StudentValidator studentValidator;
    private MailSender mailSender;

    public StudentOrderValidator() {
        cityRegisterValidator = new CityRegisterValidator();
        weddingValidator = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentValidator = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator studentOrderValidator = new StudentOrderValidator();
        studentOrderValidator.checkAll();

    }

    private void checkAll() {
        StudentOrder[] soArray = readStudentOrder();
        for (int i = 0; i < soArray.length; i++) {
            checkOneOrder(soArray[i]);
        }

    }


    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
//        AnswerWedding weddingAnswer = checkWedding(so);
//        AnswerChildren childrenAnswer = checkChildren(so);
//        AnswerStudent studentAnswer = checkStudent(so);
//        mailSender.sendMail(so);

    }


    public MailSender sendMailTo(StudentOrder so) {

        return mailSender.sendMail(so);
    }

    public AnswerStudent checkStudent(StudentOrder so) {

        return studentValidator.checkStudent(so);
    }

    public AnswerChildren checkChildren(StudentOrder so) {
        return childrenVal.checkChildren(so);
    }

    public static StudentOrder[] readStudentOrder() {
        StudentOrder[] soArray = new StudentOrder[3];
        for (int i = 0; i < soArray.length; i++) {
            soArray[i] = SaveStudentOrder.buildStudentOrder(i);
        }

        return soArray;
    }
    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingValidator.checkWedding(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }
}

