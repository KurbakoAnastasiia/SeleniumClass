package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.google.com");
        }
}
