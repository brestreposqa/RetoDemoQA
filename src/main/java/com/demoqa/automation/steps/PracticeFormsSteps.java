package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.PracticeFormsPage;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.FileUpload;
import com.demoqa.automation.utils.Javascript;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PracticeFormsSteps {

    PracticeFormsPage practiceForms = new PracticeFormsPage();
    DataInjection dataInjection= new DataInjection();
    Excel excel = new Excel();

    @Step
    public void registerStudentWithExcel() throws IOException {
        practiceForms.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        practiceForms.clickOnPracticeFormsOption();
        practiceForms.setFirstNameInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 0));
        practiceForms.setLastNameInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 1));
        practiceForms.setEmailInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 2));
        practiceForms.clickOnMaleGenderRadio();
        practiceForms.setMobileInput(Integer.toString((int) excel.getCellValueInt(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 3)));
        practiceForms.setBirthDayInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 4));
        practiceForms.setSubjectInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 5));
        practiceForms.clickOnSportHobbi();
        practiceForms.setFileInput(FileUpload.filePath(dataInjection.getFileUpload()));
        practiceForms.setCurrentAddressInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 6));
        practiceForms.setStateInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 7));
        practiceForms.setCityInput(excel.getCellValue(dataInjection.getFilePath(),dataInjection.getSheetName(), 0, 8));
        practiceForms.clickOnSubmitButton();
    }

    @Step
    public void validateSubmitForm(){
        practiceForms.validateSubmitForm();
    }
}
