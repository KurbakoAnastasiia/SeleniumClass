package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    /*Go to facebook sign up page
Fill out the whole form
Click signup
*/
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name = 'firstname']")).sendKeys("John");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("3475689045");
        Thread.sleep(1000);
        driver.findElement(By.id("password_step_input")).sendKeys("John@1234567");
        Thread.sleep(1000);
        WebElement monthDD = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthDD);
        selectMonth.selectByValue("2");
        Thread.sleep(1000);
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDD);
        selectDay.selectByVisibleText("14");
        Thread.sleep(1000);
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        selectYear.selectByVisibleText("1985");
        Thread.sleep(2000);
        WebElement radioButtonGender = driver.findElement(By.xpath("//input[@value = '2']"));
        radioButtonGender.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text() = 'Sign Up']")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
