package edu.kavacourse.studentorder.validator.register;

import edu.kavacourse.studentorder.exception.TransportException;
import edu.kavacourse.studentorder.register.CityRegisterResponse;
import edu.kavacourse.studentorder.domain.Person;
import edu.kavacourse.studentorder.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker
{
    public CityRegisterResponse checkPerson(Person person)
            throws CityRegisterException, TransportException {
        return null;
    }
}