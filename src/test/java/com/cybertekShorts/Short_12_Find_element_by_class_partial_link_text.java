package com.cybertekShorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Short_12_Find_element_by_class_partial_link_text {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/");
        // this is getting all the links on the page
        // "a" is for linkText
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Amount of links: " + allLinks.size());

        // this is navigating to the specific link as per my request
        WebElement link = driver.findElement(By.linkText("Autocomplete"));
        link.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        // below starts Short 12 - Partial link text
        // It searches for the link text and uses the first one it finds
        WebElement link2 = driver.findElement(By.partialLinkText("Drag"));

        link2.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
