package com.javaexample;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class DBExample {
    private static final String INSERT = "INSERT INTO jc_example (id, name, surname, age) values (?,?,?,?)";
    private static final String SELECT = "SELECT * FROM jc_example";

    private static List<Contact> listOfContact = new ArrayList<>();

    public static void main(String[] args) {
        Contact contact = new Contact(1L, "Zianon", "Pazniak", 70);
        insertTable(contact);
        readTable();
    }

    private static void insertTable(Contact contact) {
        Connection con = getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(INSERT);
            ps.setLong(1, contact.getId());
            ps.setString(2,contact.getName());
            ps.setString(3, contact.getSurname());
            ps.setInt(4, contact.getAge());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    private static void readTable() {
        Connection con = getConnection();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SELECT);
            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");

                Contact contact = new Contact(id, name, surname, age);
                listOfContact.add(contact);
                System.out.println(listOfContact);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static Connection getConnection() {
        Notes n = new Notes();
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    n.getUrl(), n.getLogin(), n.getPassword()
            );
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
}
