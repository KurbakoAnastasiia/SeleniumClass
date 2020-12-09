package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.findElement(By.cssSelector("a#btn_basic_example")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a")).click();
        driver.findElement(By.cssSelector("input[placeholder ^= 'Please']")).sendKeys("Hello");
        driver.findElement(By.cssSelector("button[onclick *= 'show']")).click();
        driver.findElement(By.cssSelector("input#sum1")).sendKeys("89");
        driver.findElement(By.cssSelector("input#sum2")).sendKeys("67");
        driver.findElement(By.cssSelector("button[onclick *= 'return']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
