package edu.javacourse.fields;

public class Main {
    public static void main(String[] args) throws Exception {
        String passwordGenerator = new PasswordFactory().getPassword();
        System.out.println(passwordGenerator);
    }
}
