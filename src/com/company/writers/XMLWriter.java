package com.company.writers;

public class XMLWriter implements FileWriter {
    @Override
    public void write(Object context, String fileName) {
        System.out.println("Write to XML file");
    }
}
