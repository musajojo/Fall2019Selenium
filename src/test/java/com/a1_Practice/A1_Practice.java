package com.a1_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A1_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String chromeURL = "http://google.com";
        String msnURL = "http://msn.com";
        String amazonURL = "http://amazon.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";

        driver.get("http://google.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.get("http://msn.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}


