package com.cybertekShorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_02_Basic_Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String googleURL = "http://google.com";
        String msnURL = "http://msn.com";
        String amazonURL = "http://amazon.com";
        driver.get(googleURL);
        Thread.sleep(3000);
        driver.navigate().to(amazonURL);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.get(msnURL);
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();

    }
}
