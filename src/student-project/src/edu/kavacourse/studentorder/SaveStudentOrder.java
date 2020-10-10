package edu.kavacourse.studentorder;

import edu.kavacourse.studentorder.dao.DirectoryDao;
import edu.kavacourse.studentorder.dao.DirectoryDaoImpl;
import edu.kavacourse.studentorder.dao.StudentDaoImp;
import edu.kavacourse.studentorder.dao.StudentOrderDao;
import edu.kavacourse.studentorder.domain.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

public class SaveStudentOrder {
    public static void main(String[] args) throws Exception {

//        List<Street> d = new DirectoryDaoImpl().findStreets("про");
//        for (Street s : d) {
//            System.out.println(s.getStreetName());
//        }
//        List<PassportOffice> passportOffices = new DirectoryDaoImpl().findPassportOffices("010020000000");
//        for (PassportOffice p : passportOffices) {
//            System.out.println(p.getOfficeName());
//        }
//        List<RegisterOffice> registerOffices = new DirectoryDaoImpl().findRegisterOffices("010010000000");
//        for (RegisterOffice r : registerOffices) {
//            System.out.println(r.getOfficeName());
//        }
//        List<CountryArea> ca1 = new DirectoryDaoImpl().findAreas("");
//        for (CountryArea c : ca1) {
//            System.out.println(c.getAreaId() + ": " + c.getAreaName());
//        }
//        System.out.println("------>");
//
//        List<CountryArea> ca2 = new DirectoryDaoImpl().findAreas("020000000000");
//        for (CountryArea c : ca2) {
//            System.out.println(c.getAreaId() + ": " + c.getAreaName());
//        }
//        System.out.println("------>");
//        List<CountryArea> ca3 = new DirectoryDaoImpl().findAreas("020010000000");
//        for (CountryArea c : ca3) {
//            System.out.println(c.getAreaId() + ": " + c.getAreaName());
//        }
//        System.out.println("------>");
//
//        List<CountryArea> ca4 = new DirectoryDaoImpl().findAreas("020010010000");
//        for (CountryArea c : ca4) {
//            System.out.println(c.getAreaId() + ": " + c.getAreaName());
//        }

        StudentOrder s = buildStudentOrder(10);
        StudentOrderDao dao = new StudentDaoImp();
        Long id = dao.saveStudentOrder(s);
        System.out.println(id);


        // Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/postgres",
//                "postgres", "1234");
//
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM jc_street");
//        while (rs.next()) {
//            System.out.println(rs.getLong(1) + " : " + rs.getString(2));
//        }


        //      StudentOrder s = buildStudentOrder(10);
//        StudentOrder so = new StudentOrder();
//        long ans = saveStudentOrder(so);
//        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder");
        return answer;
    }

    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder so = new StudentOrder();
        so.setStudentOrderId(id);

        so.setMarriageCertificateId("" + (123456000 + id));
        so.setMarriageDate(LocalDate.of(2016, 7, 4));
        RegisterOffice ro = new RegisterOffice(1L, "", "");
        so.setMarriageOffice(ro);

        Street street = new Street(1L, "First Street");
        Address address = new Address("195000", street, "12", "", "142");

        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));

        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        PassportOffice po1 = new PassportOffice(1L, "", "");
        husband.setIssueDepartment(po1);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        PassportOffice po2 = new PassportOffice(1L, "", "");
        wife.setIssueDepartment(po2);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        RegisterOffice po3 = new RegisterOffice(1L, "", "");
        child1.setIssueDepartment(po3);
        child1.setAddress(address);

        Child child2 = new Child("Петров", "Армен", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (300000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        RegisterOffice po4 = new RegisterOffice(1L, "", "");
        child2.setIssueDepartment(po4);
        child2.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }
}