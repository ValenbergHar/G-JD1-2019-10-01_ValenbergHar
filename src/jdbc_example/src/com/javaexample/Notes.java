package com.javaexample;

public class Notes {
    private static final String url = "jdbc:postgresql://localhost:5432/example";
    private static final String login = "postgres";
    private static final String password = "1234";

    public static String getUrl() {
        return url;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

}
