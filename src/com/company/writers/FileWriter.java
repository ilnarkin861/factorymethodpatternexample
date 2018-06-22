package com.company.writers;


@FunctionalInterface
public interface FileWriter {

    void write(Object context, String fileName);
}
