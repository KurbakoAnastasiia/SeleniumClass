package com.company.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String aqctualTitle = driver.getTitle();
        String expectedTitle = "Web Orders";
       if(aqctualTitle.equalsIgnoreCase(expectedTitle)) {
           System.out.println("Title match");
       } else {
           System.out.println("Title doesn't match");
       }
       Thread.sleep(2000);
       driver.findElement(By.partialLinkText("Logout")).click();
       Thread.sleep(2000);
       driver.quit();
       }

    }

