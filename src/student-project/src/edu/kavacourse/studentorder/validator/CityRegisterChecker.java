package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.kavacourse.studentorder.domain.Person;
import edu.kavacourse.studentorder.exception.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
