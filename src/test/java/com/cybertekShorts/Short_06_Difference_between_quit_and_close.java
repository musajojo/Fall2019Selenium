package com.cybertekShorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Short_06_Difference_between_quit_and_close {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://msn.com");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.quit();

    }
}
/*
Selenium webdriver provides two methods for closing a browser window – driver.close() and driver.quit(). Some people incorrectly use them interchangeably but the two methods are different. In this post, we will study the difference between the two and also see where to use them effectively.


driver.close()
The driver.close() command is used to close the current browser window having focus. In case there is only one browser open then calling driver.close() quits the whole browser session.
Usability
It is best to use driver.close() when we are dealing with multiple browser tabs or windows e.g. when we click on a link that opens another tab. In this case after performing required action in the new tab, if we want to close the tab we can call the driver.close() method.


1 //Closing the tab
2 driver.close();


driver.quit()
The driver.quit() is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.
Usability
It is best to use driver.quit() when we no longer want to interact with the driver object along with any associated window, tab or pop-up. Generally, it is one of the last statements of the automation scripts. In case, we are working with Selenium with TestNG or JUnit, we call driver.quit() in the @AfterSuite method of our suite. Thus, closing it at the end of the whole suite.


1 @AfterSuite
2 public void tearDown() {
3   driver.quit();
4 }
That’s all we have in this post, comment below if you have any queries. check our complete selenium tutorial here.

https://artoftesting.com/difference-between-driver-close-and-driver-quit-command-in-selenium-webdriver
 */