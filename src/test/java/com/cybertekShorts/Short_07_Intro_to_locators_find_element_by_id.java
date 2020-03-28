package com.cybertekShorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Short_07_Intro_to_locators_find_element_by_id {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String chromeURL = "http://google.com";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(chromeURL);
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        String actualText = btn1.getAttribute("value");
        String expectedText = "I'm Feeling Lucky";
        if (actualText.equals(expectedText)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
            System.out.println("Expected text: " + expectedText);
            System.out.println("Actual text: " + actualText);
        }
        btn1.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
