package com.company.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver newDriver = new ChromeDriver();
        newDriver.get("https://www.amazon.com/");
        String url = newDriver.getCurrentUrl();
        System.out.println(url);
        String title = newDriver.getTitle();
        System.out.println(title);
    }
}
