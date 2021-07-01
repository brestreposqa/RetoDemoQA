package com.demoqa.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Javascript {
    public static void clickJS(WebDriver driver, By by){
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElements(by));
    }

    public  static void scrollDown(WebDriver driver){
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,200)");
    }
}
