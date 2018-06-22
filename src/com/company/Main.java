package com.company;

import com.company.factory.FileWriterFactory;
import com.company.factory.PDFWriterFactory;

public class Main {

    public static void main(String[] args) {
        FileWriterFactory writerFactory = new PDFWriterFactory();
        writerFactory.getWriter().write(null, "");
    }
}
