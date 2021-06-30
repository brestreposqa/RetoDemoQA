package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));

    private String filePath, sheetName,fileUploadPath;

    public DataInjection(){
        this.filePath = "Data.xlsx";
        this.sheetName = "DataRegister";
        this.fileUploadPath="file_QA.jpg";
    }

    public Faker getFaker() {
        return faker;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getFileUpload() {
        return fileUploadPath;
    }

}
