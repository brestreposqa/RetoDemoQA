package com.demoqa.automation.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel {

    public String getCellValue(String filePath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File excelFile = new File(filePath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook worbook = new XSSFWorkbook(inputStream);
        Sheet sheet = worbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell= row.getCell(cellNumber);

        return cell.getStringCellValue();
    }

    public double getCellValueInt(String filePath, String sheetName, int rowNumber, int cellNumber) throws IOException {
        File excelFile = new File(filePath);
        FileInputStream inputStream = new FileInputStream(excelFile);
        Workbook worbook = new XSSFWorkbook(inputStream);
        Sheet sheet = worbook.getSheet(sheetName);
        Row row = sheet.getRow(rowNumber);
        Cell cell= row.getCell(cellNumber);

        return cell.getNumericCellValue();
    }
}
