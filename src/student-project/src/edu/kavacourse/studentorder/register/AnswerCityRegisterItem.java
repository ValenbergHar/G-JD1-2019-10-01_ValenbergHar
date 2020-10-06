package edu.kavacourse.studentorder.register;

import edu.kavacourse.studentorder.domain.Person;
public class AnswerCityRegisterItem {
    public enum CityStatus {
        YES, NO, ERROR;
    }

    public static class CityError {
        private String code;
        private String text;

        public CityError(String code, String text) {
            this.code = code;
            this.text = text;
        }


        public String getCode() {
            return code;
        }

        public String getText() {
            return text;
        }
    }

    private Person person;
    private CityStatus status;

    public AnswerCityRegisterItem(Person person, CityStatus status) {
        this.person = person;
        this.status = status;
    }

    private CityError error;

    public AnswerCityRegisterItem(Person person, CityStatus status, CityError error) {
        this.person = person;
        this.status = status;
        this.error = error;
    }
}
