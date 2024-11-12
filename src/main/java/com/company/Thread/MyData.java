package com.company.Thread;

import java.io.File;

public class MyData {

    private static int fileCount = 0;
    private static int folderCount = 0;
    private static double size = 0;



    static void showDetailes() {
        System.out.println("fileCount = " + fileCount);
        System.out.println("folderCount = " + folderCount);
        System.out.println("size = " + (size / (1024 * 1024 * 1024)));
    }

    static void incrementFolder() {
        folderCount++;
    }

    static void incrementFile() {
        fileCount++;
    }


    static void addSize(long length) {
        size += length;
    }

    static void fileSearch(File file) {
        String fileName = file.getName().toLowerCase();
        if (fileName.endsWith(".txt")) {
            System.out.println("Shubhali fayl topildi: " + file.getAbsolutePath());
        }
    }
}
