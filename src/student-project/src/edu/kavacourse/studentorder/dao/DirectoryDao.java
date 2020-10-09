package edu.kavacourse.studentorder.dao;

import edu.kavacourse.studentorder.domain.Street;
import edu.kavacourse.studentorder.exception.DaoException;

import java.util.List;

public interface DirectoryDao {
    List<Street> findStreets(String pattern) throws DaoException;
}
