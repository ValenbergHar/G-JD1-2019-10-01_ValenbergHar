package edu.javacourse.constr;

import edu.javacourse.constr.ann.Generator;

public class SuperPasswordGenerator {
    private String algorithm;
    private String name;

    public SuperPasswordGenerator(String algorithm, String name) {
        this.algorithm = algorithm;
        this.name = name;
    }

    @Generator
    private String createPassword() {
        return "Super password: " + algorithm + ", " + name;
    }
}
