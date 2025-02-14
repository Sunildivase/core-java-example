package com.filehandling;

import java.io.IOException;

public class FileWriter {
    private static final String FILE_PATH = "E:\\JAVA_TRAINING\\fileDemo\\";

    private static final String FILE_NAME = "test.txt";

    public FileWriter(String s) {
    }


    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH + FILE_NAME);
            // writing the content into the FileOperationExample.txt file
            fileWriter.write("This is sample data written to file..\n\nThis data is written to new line in this file.");

            System.out.println("Content is successfully written to the file.");
        } finally {
            System.out.println("closing file writer..");
            // Closing the stream
            fileWriter.close();
        }
    }

    private void close() {
    }

    private void write(String s) {
    }
}
