package com.company.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW2
{
    /*TC 1: Amazon link count:
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        int countLinksWithText = 0;
        for (WebElement links : allLinks) {
            String fullLink = links.getAttribute("href");
            String textlink = links.getText();
            if(!textlink.isEmpty()) {
                countLinksWithText++;
                System.out.println(textlink + "               " + fullLink);
            }

        }
        System.out.println("Number of non-empty links is " + countLinksWithText);
        driver.quit();
    }
}
