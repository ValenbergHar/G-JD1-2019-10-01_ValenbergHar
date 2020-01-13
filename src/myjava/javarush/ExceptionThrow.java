package javarush;

import java.util.Arrays;
import java.util.List;

public class ExceptionThrow {

     void print(String s) {
        if (s == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        ExceptionThrow print = new ExceptionThrow();
        List<String> ll= Arrays.asList("first step", null, "second step");

        for (String s:ll) {
            try {
                print.print(s);
            }
            catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            finally {
                System.out.println("Inside bloñk finally");
            }
            System.out.println("Go program....");
            System.out.println("-----------------");
        }

    }
    }