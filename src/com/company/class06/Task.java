package com.company.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Task {
    /*Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text Syntax Technologies -......
verify enroll today button is enabled */

    public static String url = "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");
        WebElement frameHeader = driver.findElement(By.xpath("//a[text() = 'SYNTAX TECHNOLOGIES ']"));
        boolean isHeaderDisplayed = frameHeader.isDisplayed();
        System.out.println("Is header displayed " + isHeaderDisplayed);

        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        WebElement secondFrame = driver.findElement(By.xpath("//iframe[@name = 'FrameTwo']"));
        driver.switchTo().frame(secondFrame);
        WebElement enrollTodatButton = driver.findElement(By.xpath("//a[text() = 'Enroll Today']"));
        boolean isEnrollButtonEnable = enrollTodatButton.isEnabled();
        System.out.println("Is enroll today enabled " + isEnrollButtonEnable);

    }
}