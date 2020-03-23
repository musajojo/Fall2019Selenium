package com.cybertekShorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//BasicNavigation
public class Short_01_Selenium_Introduction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://msn.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
