package com.cybertekShorts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_08_Find_element_by_tag_name {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String chromeURL = "http://google.com";
        String msnURL = "http://msn.com";
        String amazonURL = "http://amazon.com";
        String cybertekPracticeURL = "http://practice.cybertekschool.com/";

        driver.get(cybertekPracticeURL);
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        Thread.sleep(3000);
        driver.quit();
    }
}
