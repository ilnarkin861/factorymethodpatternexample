package com.company.factory;

import com.company.writers.FileWriter;
import com.company.writers.XMLWriter;

public class XMLWriterFactory implements FileWriterFactory {
    @Override
    public FileWriter getWriter() {
        return new XMLWriter();
    }
}
