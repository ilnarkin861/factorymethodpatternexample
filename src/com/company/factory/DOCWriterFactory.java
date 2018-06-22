package com.company.factory;

import com.company.writers.DOCWriter;
import com.company.writers.FileWriter;

public class DOCWriterFactory implements FileWriterFactory {
    @Override
    public FileWriter getWriter() {
        return new DOCWriter();
    }
}
