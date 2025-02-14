package com.filehandling;

import java.io.*;


public class OldFashionCodeFileReader {

    private static final String FILE_PATH = "E:\\JAVA_TRAINING\\fileDemo\\";
    private static final String FILE_NAME = "test.txt";

    public static void main(String[] args) {

        BufferedReader buffer = null;
        try {
            Reader fileReader = new FileReader(FILE_PATH + FILE_NAME);
            buffer = new BufferedReader(fileReader);

            System.out.println("--------------- start of file -------------------");
            String strCurrentLine;
            while ((strCurrentLine = buffer.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
            System.out.println("------------ end of file ------------");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (buffer != null)
                    buffer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


