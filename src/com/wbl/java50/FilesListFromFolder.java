package com.wbl.java50;

import java.io.File;

public class FilesListFromFolder {
     
    public static void main(String args[]){
        File file = new File("./src/com.wbl.java50/MyFolder/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}