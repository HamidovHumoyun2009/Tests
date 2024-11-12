package com.company.Thread;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        File root = new File("D:\\");

        if (root.list() == null){
            return;
        }
        for (String fileName : root.list()) {
            File file = new File(root,fileName);
            if (file.isFile()){
                MyData.incrementFile();
                MyData.addSize(file.length());
                MyData.fileSearch(file);
            }else {
                MyData.incrementFolder();
                ScanThread scanThread = new ScanThread(root + "\\" + fileName);
                scanThread.start();

            }
        }
        MyData.showDetailes();
    }
}
