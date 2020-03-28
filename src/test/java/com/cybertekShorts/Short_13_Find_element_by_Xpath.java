package com.cybertekShorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_13_Find_element_by_Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(2000);

        // Absolute XPath (Full XPath)
        WebElement dropDownLink = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[2]/a"));

        System.out.println(dropDownLink.getText());
        dropDownLink.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        // Relative XPath
        WebElement headerText = driver.findElement(By.xpath("//span[@class=\"h1y\"]"));
        System.out.println("h1 Text: " + headerText.getText());
        Thread.sleep(2000);

        // Relative XPath by Text ----->> the .= means text. Text has to be exact, case sensitive.
        WebElement contextMenuLink = driver.findElement(By.xpath("//a[.='Context Menu']"));
        System.out.println("Context Menu Text: " + contextMenuLink.getText());
        contextMenuLink.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);

        // Another Example of Relative XPath by Text
        WebElement brokImg = driver.findElement(By.xpath("//a[@href=\"/broken_images\"]"));
        System.out.println("Broken Images text: " + brokImg.getText());
        brokImg.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
