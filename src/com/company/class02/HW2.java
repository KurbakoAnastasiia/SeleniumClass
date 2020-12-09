package com.company.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
    * */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("u_0_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("3627191073");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("u_1_9")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
