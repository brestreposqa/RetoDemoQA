package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("https://www.demoqa.com/")
public class HomePage extends PageObject {

    public By formsOption = By.xpath("//h5[contains(text(),'Forms')]");

    public void clickFormsOption(){
        getDriver().findElement(formsOption).click();
    }


}
