package edu.javacourse.fields;

import edu.javacourse.fields.ann.Generator;

public class PasswordGeneratorFirst {

    @Generator
    public String buildPassword() {
        return "First";
    }


}
