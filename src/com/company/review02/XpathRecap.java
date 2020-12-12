package com.company.review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathRecap {
    public static String url = "http://syntaxtechs.com/selenium-practice/index.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        // Let's check whether Syntax logo is displayed on the top of the web page

        // use two attributes

        WebElement logo=driver.findElement(By.xpath("//img[@id='hide' and @width='11%']"));

        // use one atrribute and index  --> (//img[@id='hide'])[2]

        // findElements() --> List<WebElements>

        List<WebElement> logos=driver.findElements(By.xpath("//img[@id='hide']"));

        logos.get(0); // --> First logo
        logos.get(1); // --> Second logo on the bottom

        //tagName[contains(@attribute,'attributeValue')]

        WebElement logo1=driver.findElement(By.xpath("(//img[contains(@src, 'syntaxlogowhite')])[1]"));
        System.out.println("Is logo1 displayed = "+logo1.isDisplayed());

        //tagName[starts-with(@attribute,'attributeValue')]

        WebElement logo2=driver.findElement(By.xpath("(//img[starts-with(@src, 'img/syntax')])[2]"));
        System.out.println("Is logo2 enabled = "+ logo2.isEnabled());


        Thread.sleep(2000);

        //tagName[contains(text(),'textValue')]

        driver.findElement(By.xpath("//a[contains(text(), 'gress Bars & Slid')]")).click();

        //tagName[starts-with(text(),'textValue')]

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(text(), 'Progress Bars')]")).click();


        Thread.sleep(2000);
        driver.quit();
    }
    }
