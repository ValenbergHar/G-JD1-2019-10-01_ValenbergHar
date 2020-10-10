package edu.kavacourse.studentorder.dao;

import edu.kavacourse.studentorder.domain.StudentOrder;
import edu.kavacourse.studentorder.exception.DaoException;

public interface StudentOrderDao {
    Long saveStudentOrder(StudentOrder so) throws DaoException;

}
