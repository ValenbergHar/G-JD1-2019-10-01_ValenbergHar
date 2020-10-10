package edu.kavacourse.studentorder.dao;

import edu.kavacourse.studentorder.domain.CountryArea;
import edu.kavacourse.studentorder.domain.PassportOffice;
import edu.kavacourse.studentorder.domain.RegisterOffice;
import edu.kavacourse.studentorder.domain.Street;
import edu.kavacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DirectoryDao {
    List<Street> findStreets(String pattern) throws DaoException;
    List<PassportOffice> findPassportOffices (String areaId) throws DaoException;
    List<RegisterOffice> findRegisterOffices (String areaId) throws DaoException;
    List<CountryArea> findAreas (String areaId) throws DaoException;

}
