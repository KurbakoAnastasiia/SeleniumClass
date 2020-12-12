package com.company.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanlingAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(3000);
        Alert simpleAlert = driver.switchTo().alert();
        // handling simple alert
        simpleAlert.accept();

        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(3000);
        Alert confirmAlert = driver.switchTo().alert();
        // handling conformation alert
        String confirmAlertText = confirmAlert.getText();
        System.out.println(confirmAlertText);
        confirmAlert.dismiss(); // click cancel

        WebElement promtAlertButton = driver.findElement(By.id("prompt"));
        promtAlertButton.click();
        Thread.sleep(2000);
        Alert promtAlert = driver.switchTo().alert();
        promtAlert.sendKeys("Syntax techs");
        promtAlert.accept();


    }
}
