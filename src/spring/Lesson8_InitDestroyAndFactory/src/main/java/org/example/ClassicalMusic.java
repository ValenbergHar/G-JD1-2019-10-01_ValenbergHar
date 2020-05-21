package org.example;

public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("doing initialisation");
    }

    public void doMyDestroy() {
        System.out.println("doing destroy");
    }


    @Override
    public String getSong() {
        return "Spring";

    }


}
