package edu.kavacourse.studentorder;

import edu.kavacourse.studentorder.dao.DirectoryDao;
import edu.kavacourse.studentorder.dao.DirectoryDaoImpl;
import edu.kavacourse.studentorder.domain.*;

import java.time.LocalDate;
import java.util.List;

public class SaveStudentOrder {
    public static void main(String[] args) throws Exception {
//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/jc_student",
//                "postgres", "1234");
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM jc_street");
        List<Street> d = new DirectoryDaoImpl().findStreets("d");
        for (Street s: d) {
            System.out.println(s.getStreetName());
        }

//        while (rs.next()) {
//            System.out.println(rs.getLong(1) + " : " + rs.getString(2));
//        }
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM jc_student");
//        while(rs.next()){
//
//            System.out.println(rs.getLong(1) +" : " + rs.getString(2));
//        }


//        Class.forName("org.postgresql.Driver");
//        Connection con = DriverManager.getConnection(
//                "jdbc:postgresql://localhost:5432/jc_student",
//                "postgres", "postgres");
//
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery("SELECT * FROM jc_street");
//        while(rs.next()) {
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
        so.setMarriageOffice("Отдел ЗАГС");

        Street street = new Street(1L, "First Street");
        Address address = new Address("195000", street, "12", "", "142");

        // Муж
        Adult husband = new Adult("Петров", "Виктор", "Сергеевич", LocalDate.of(1997, 8, 24));

        husband.setPassportSeria("" + (1000 + id));
        husband.setPassportNumber("" + (100000 + id));
        husband.setIssueDate(LocalDate.of(2017, 9, 15));
        husband.setIssueDepartment("Отдел милиции №" + id);
        husband.setStudentId("" + (100000 + id));
        husband.setAddress(address);
        // Жена
        Adult wife = new Adult("Петрова", "Вероника", "Алекссевна", LocalDate.of(1998, 3, 12));
        wife.setPassportSeria("" + (2000 + id));
        wife.setPassportNumber("" + (200000 + id));
        wife.setIssueDate(LocalDate.of(2018, 4, 5));
        wife.setIssueDepartment("Отдел милиции №" + id);
        wife.setStudentId("" + (200000 + id));
        wife.setAddress(address);
        // Ребенок
        Child child1 = new Child("Петрова", "Ирина", "Викторовна", LocalDate.of(2018, 6, 29));
        child1.setCertificateNumber("" + (300000 + id));
        child1.setIssueDate(LocalDate.of(2018, 7, 19));
        child1.setIssueDepartment("ОТдел ЗАГС №" + id);
        child1.setAddress(address);

        Child child2 = new Child("Петров", "Армен", "Викторович", LocalDate.of(2018, 6, 29));
        child2.setCertificateNumber("" + (300000 + id));
        child2.setIssueDate(LocalDate.of(2018, 7, 19));
        child2.setIssueDepartment("ОТдел ЗАГС №" + id);
        child2.setAddress(address);

        so.setHusband(husband);
        so.setWife(wife);
        so.addChild(child1);
        so.addChild(child2);

        return so;
    }
}