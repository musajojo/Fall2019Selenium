package com.cybertekShorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_05_Full_screen_mode {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://msn.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().to("http://google.com");
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());

        driver.quit();

        /*
        driver.manage().window().fullscreen();

The browser's menu bar is not visible
The whole desktop estate is covered up by the browser.
The Task bar is not visible
driver.manage().window().maximize();

The browser's menu bar is visible
The whole desktop estate is not covered up by the browser.
The Task bar is visible
https://stackoverflow.com/questions/40741208/what-is-the-difference-between-the-selenium-methods-maximize-and-fullscreen
         */
    }
}
