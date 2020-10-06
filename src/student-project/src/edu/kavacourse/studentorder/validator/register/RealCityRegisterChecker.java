package edu.kavacourse.studentorder.validator.register;

import edu.kavacourse.studentorder.register.CityRegisterCheckerResponse;
import edu.kavacourse.studentorder.domain.Person;
import edu.kavacourse.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        return null;
    }
}