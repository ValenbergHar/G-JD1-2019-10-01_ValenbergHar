package edu.kavacourse.studentorder;

import edu.kavacourse.studentorder.domain.*;
import edu.kavacourse.studentorder.mail.MailSender;
import edu.kavacourse.studentorder.validator.ChildrenValidator;
import edu.kavacourse.studentorder.validator.CityRegisterValidator;
import edu.kavacourse.studentorder.validator.StudentValidator;
import edu.kavacourse.studentorder.validator.WeddingValidator;

import java.util.LinkedList;
import java.util.List;

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
        List<StudentOrder> soList = readStudentOrder();
        for (StudentOrder so : soList) {
            checkOneOrder(so);
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

    public static List<StudentOrder> readStudentOrder() {
        List<StudentOrder> soList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            StudentOrder so = new SaveStudentOrder().buildStudentOrder(i);
            soList.add(so);
        }

        return soList;
    }

    public AnswerWedding checkWedding(StudentOrder so) {
        return weddingValidator.checkWedding(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        return cityRegisterValidator.checkCityRegister(so);
    }
}

