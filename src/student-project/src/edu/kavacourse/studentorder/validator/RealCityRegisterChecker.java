package edu.kavacourse.studentorder.validator;

import edu.kavacourse.studentorder.domain.Adult;
import edu.kavacourse.studentorder.domain.Child;
import edu.kavacourse.studentorder.domain.CityRegisterCheckerResponse;
import edu.kavacourse.studentorder.domain.Person;
import edu.kavacourse.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        return null;
    }
}