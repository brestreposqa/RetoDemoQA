package com.demoqa.automation.steps;

import com.demoqa.automation.pageobjects.HomePage;
import com.demoqa.automation.utils.Javascript;
import net.thucydides.core.annotations.Step;

import java.util.concurrent.TimeUnit;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void selectFormsOption(){
        homePage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Javascript.scrollDown(homePage.getDriver());
        homePage.clickFormsOption();
    }
}
