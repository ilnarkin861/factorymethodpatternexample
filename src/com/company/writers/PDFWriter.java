package com.company.writers;

public class PDFWriter implements FileWriter {
    @Override
    public void write(Object context, String fileName) {
        System.out.println("Write to PDF file");
    }
}
