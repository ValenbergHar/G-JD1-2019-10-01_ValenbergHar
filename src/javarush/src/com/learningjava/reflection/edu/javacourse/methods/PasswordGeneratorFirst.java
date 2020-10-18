package edu.javacourse.methods;

import edu.javacourse.methods.ann.Generator;

public class PasswordGeneratorFirst {

    @Generator
    public String buildPassword() {
        return "First";
    }


}
