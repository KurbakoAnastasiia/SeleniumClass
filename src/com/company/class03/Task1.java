package com.company.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.xpath("//input[contains(@name, 'username')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value = 'Login']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
        driver.quit();
    }
}
