package com.company.factory;

import com.company.writers.FileWriter;

public interface FileWriterFactory {

    FileWriter getWriter();
}
