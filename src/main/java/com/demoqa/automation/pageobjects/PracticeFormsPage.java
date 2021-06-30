package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PracticeFormsPage extends PageObject {

    public By practiceFormsOption = By.xpath("//span[contains(text(),'Practice Form')]");
    public By firstNameInput = By.id("firstName");
    public By lastNameInput = By.id("lastName");
    public By emailInput = By.id("userEmail");
    public  By maleGenderRadio = By.xpath("//label[contains(text(),'Male')]");
    public By femaleGenderRadio = By.xpath("//label[contains(text(),'Female')]");
    public By otherGenderRadio = By.xpath("//label[contains(text(),'Other')]");
    public By mobileInput = By.id("userNumber");
    public By dateBirthCalendar= By.id("dateOfBirthInput");
    public By antesSubject=By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']");
    public By subjectInput = By.id("subjectsInput");
    public By sportHobbiCheck = By.xpath("//label[contains(text(),'Sport')]");
    public By readingHobbisCheck = By.xpath("//label[contains(text(),'Reading')]");
    public By musicHobbiCheck = By.xpath("//label[contains(text(),'Music')]");
    public By pictureUpload = By.id("uploadPicture");
    public By currentAddressInput = By.id("currentAddress");
    public By stateInput = By.id("react-select-3-input");
    public By cityInput = By.id("react-select-4-input");
    public By submitButton = By.id("submit");
    public By submitMessage =By.id("example-modal-sizes-title-lg");

    public void clickOnPracticeFormsOption(){
        getDriver().findElement(practiceFormsOption).click();
    }

    public void setFirstNameInput(String string){
        getDriver().findElement(firstNameInput).sendKeys(string);
    }

    public void setLastNameInput(String string){
        getDriver().findElement(lastNameInput).sendKeys(string);
    }

    public void setEmailInput(String string){
        getDriver().findElement(emailInput).sendKeys(string);
    }

    public void clickOnMaleGenderRadio(){
        getDriver().findElement(maleGenderRadio).click();
    }

    public void clickOnFemaleGenderRadio(){
        getDriver().findElement(femaleGenderRadio).click();
    }

    public void clickOnOtherGenderRadio(){
        getDriver().findElement(otherGenderRadio).click();
    }

    public void setMobileInput(String string){
        getDriver().findElement(mobileInput).sendKeys(string);
    }

    public void setBirthDayInput(String string){
        getDriver().findElement(dateBirthCalendar).sendKeys(Keys.CONTROL+"a");
        getDriver().findElement(dateBirthCalendar).sendKeys(string);
        getDriver().findElement(dateBirthCalendar).sendKeys(Keys.ENTER);
    }

    public void clickOnSubjectInput(){
        getDriver().findElement(antesSubject).click();
    }

    public void setSubjectInput(String string){
        getDriver().findElement(subjectInput).sendKeys(string);
        getDriver().findElement(subjectInput).sendKeys(Keys.ENTER);
    }

    public void clickOnSportHobbi(){
        getDriver().findElement(sportHobbiCheck).click();
    }

    public void clickOnReadingHobbi(){
        getDriver().findElement(readingHobbisCheck).click();
    }

    public void clickOnMusictHobbi(){
        getDriver().findElement(musicHobbiCheck).click();
    }

    public void setFileInput(String string){
        getDriver().findElement(pictureUpload).sendKeys(string);
    }

    public void setCurrentAddressInput(String string){
        getDriver().findElement(currentAddressInput).sendKeys(string);
    }

    public void setStateInput(String string){
        getDriver().findElement(stateInput).sendKeys(string+Keys.ENTER);
    }

    public void setCityInput(String string){
        getDriver().findElement(cityInput).sendKeys(string+Keys.ENTER);
    }

    public void clickOnSubmitButton(){
        getDriver().findElement(submitButton).submit();
    }

    public void validateSubmitForm(){
        assert(getDriver().findElement(submitMessage).isDisplayed());
    }
}
