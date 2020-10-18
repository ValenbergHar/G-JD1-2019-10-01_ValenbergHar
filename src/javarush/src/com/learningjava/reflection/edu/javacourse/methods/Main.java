package edu.javacourse.methods;

public class Main {
    public static void main(String[] args) {
        String passwordGenerator = new PasswordFactory().getPassword();
        System.out.println(passwordGenerator);
    }
}
