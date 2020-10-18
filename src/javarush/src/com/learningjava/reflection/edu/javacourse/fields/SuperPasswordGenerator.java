package edu.javacourse.fields;

import edu.javacourse.fields.ann.Generator;

public class SuperPasswordGenerator {
    private String algorithm;
    private String name;



    @Generator
    private String createPassword() {
        return "Super password: " + algorithm + ", " + name;
    }
}
