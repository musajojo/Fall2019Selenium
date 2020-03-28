package com.cybertekShorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Short_10_Find_element_by_class_name {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        List<WebElement> listOfExamples = driver.findElements(By.className("list-group-item"));
        System.out.println("Size: " + listOfExamples.size());
        Thread.sleep(3000);
        driver.quit();



    }
}
