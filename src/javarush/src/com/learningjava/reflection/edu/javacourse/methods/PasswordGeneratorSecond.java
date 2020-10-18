package edu.javacourse.methods;

import edu.javacourse.methods.ann.Generator;

public class PasswordGeneratorSecond {
    static {
        System.out.println("passwordGeneratorSecond");
    }

    @Generator
    public String generatePassword() {
        return "Second";
    }
}
