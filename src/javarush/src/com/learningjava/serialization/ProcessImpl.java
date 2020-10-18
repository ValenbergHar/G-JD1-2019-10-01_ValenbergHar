package com.learningjava;

public class ProcessImpl implements Processor {

    @Override
    public String process(String code, String name) {
        return code + ": " + name;
    }
}
