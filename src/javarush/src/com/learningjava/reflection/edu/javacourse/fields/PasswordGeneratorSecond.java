package edu.javacourse.fields;

import edu.javacourse.fields.ann.Generator;

public class PasswordGeneratorSecond {
    static {
        System.out.println("passwordGeneratorSecond");
    }

    @Generator
    public String generatePassword() {
        return "Second";
    }
}
