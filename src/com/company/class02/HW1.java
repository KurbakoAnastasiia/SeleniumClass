package com.company.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
    * */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Jack");
        driver.findElement(By.id("customer.lastName")).sendKeys("Fox");
        driver.findElement(By.name("customer.address.street")).sendKeys("165 Brown Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.name("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11234");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("1284720847");
        driver.findElement(By.id("customer.ssn")).sendKeys("1923-37-89");
        driver.findElement(By.name("customer.username")).sendKeys("johnsmith@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("Smith12345");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Smith12345");
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
