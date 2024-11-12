package com.company.Thread;

import java.io.File;

public class ScanThread extends Thread{
    private String root;

    public ScanThread(String root) {
        this.root = root;
    }

    @Override
    public void run() {
        scan(root);
    }

    private  void scan(String folderName){
        File root = new File(folderName);

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

                scan(folderName + "\\" + fileName);
            }
        }
        MyData.showDetailes();
    }
}
