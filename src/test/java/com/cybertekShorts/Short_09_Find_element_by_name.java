package com.cybertekShorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_09_Find_element_by_name {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.manage().window().maximize();

        WebElement button2 = driver.findElement(By.name("button2"));

        button2.click();

        WebElement result = driver.findElement(By.id("result"));
        System.out.println(result.getText());
        Thread.sleep(1000);
        driver.quit();






    }
}