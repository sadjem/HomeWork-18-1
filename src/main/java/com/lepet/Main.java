package com.lepet;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File(".");
        listFiles(file);
    }
    private static void listFiles(File file) {
        for (File files : file.listFiles()) {
            if (files.isFile()) {
                System.out.println(files);
            }
        }
    }
}
