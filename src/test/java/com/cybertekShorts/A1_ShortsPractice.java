package com.cybertekShorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_ShortsPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String chromeURL = "http://google.com";
        String msnURL = "http://msn.com";
        String amazonURL = "http://amazon.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";

        driver.get(chromeURL);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get(msnURL);
        Thread.sleep(3000);
        driver.navigate().to(amazonURL);
        Thread.sleep(3000);
        driver.navigate().back(); // msn
        Thread.sleep(3000);
        driver.navigate().back(); // google
        Thread.sleep(3000);
        driver.navigate().forward(); // msn
        Thread.sleep(3000);
        driver.navigate().refresh(); // msn
        Thread.sleep(3000);
        System.out.println(driver.getTitle()); // msn
        driver.quit();
    }
}
