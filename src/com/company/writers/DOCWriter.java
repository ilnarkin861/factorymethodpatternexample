package com.company.writers;

public class DOCWriter implements FileWriter {
    @Override
    public void write(Object context, String fileName) {
        System.out.println("Write to DOC file");
    }
}
