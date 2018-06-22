package com.company.factory;

import com.company.writers.FileWriter;
import com.company.writers.PDFWriter;

public class PDFWriterFactory implements FileWriterFactory {
    @Override
    public FileWriter getWriter() {
        return new PDFWriter();
    }
}
