package com.demoqa.automation.utils;

import java.io.File;

public class FileUpload {
    public static String filePath(String string){
        File file = new File(string);
        String path=file.getAbsolutePath();

        return path;
    }
}
