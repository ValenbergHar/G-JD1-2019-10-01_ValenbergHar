package edu.kavacourse.studentorder.dao;

import edu.kavacourse.studentorder.domain.Street;
import edu.kavacourse.studentorder.exception.DaoException;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDaoImpl implements DirectoryDao {
    private static final String GET_STREET = "SELECT street_code, street_name WHERE UPPER(street_name) LIKE UPPER(?)";

    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jc_student",
                "postgres", "1234");
        return con;
    }

    public List<Street> findStreets(String pattern) throws DaoException {
        //       Class.forName("org.postgresql.Driver");
        List<Street> result = new LinkedList<>();

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(GET_STREET)) {
            stmt.setString(1, "%" + pattern + "%");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Street str = new Street(rs.getLong("street_code"),
                        rs.getString("street_name"));
                result.add(str);
            }
        } catch (SQLException ex) {
            throw new DaoException(ex);
        }
        return result;
    }
}
