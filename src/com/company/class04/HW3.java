package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*HRMS Application Negative Login:
Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        WebElement message = driver.findElement(By.cssSelector("span#spanMessage"));
        boolean isDisplayed = message.isDisplayed();

        System.out.println("Error message Password cannot be empty is displayed " + isDisplayed);

        driver.quit();


    }
}
