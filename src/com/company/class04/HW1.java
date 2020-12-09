package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*Open chrome browser
Go to "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.*/
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        Thread.sleep(2000);
        WebElement logoSyntax = driver.findElement(By.cssSelector("img[src *= 'syntax.png']"));
        boolean isDisplayed = logoSyntax.isDisplayed();
        System.out.println("The Syntax Logo is displayed " + isDisplayed);
        Thread.sleep(2000);
        driver.quit();

    }
}
