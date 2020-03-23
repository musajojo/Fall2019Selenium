package com.cybertekShorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_04_Page_title {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
