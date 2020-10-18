package edu.javacourse.ref;

public class Main {
    public static void main(String[] args) {
        String passwordGenerator = new PasswordFactory().getPassword();
        System.out.println(passwordGenerator);
    }
}
