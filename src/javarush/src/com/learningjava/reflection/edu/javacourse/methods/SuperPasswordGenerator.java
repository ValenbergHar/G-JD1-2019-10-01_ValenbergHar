package edu.javacourse.methods;

import edu.javacourse.methods.ann.Generator;

public class SuperPasswordGenerator {
    public String algorithm;
    public String name;
    public void aTest(){

    }
    @Generator
    public String createPassword() {
        return "Super password";
    }
}
