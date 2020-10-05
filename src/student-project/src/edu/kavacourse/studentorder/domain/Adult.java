package edu.kavacourse.studentorder.domain;

import java.time.LocalDate;
import java.util.Locale;

public class Adult  extends Person{
    private String passportSeria;
    private String passportNumber;
    private Locale issueDate;
    private String university;

    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Locale getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Locale issueDate) {
        this.issueDate = issueDate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    private String studentId;
}
