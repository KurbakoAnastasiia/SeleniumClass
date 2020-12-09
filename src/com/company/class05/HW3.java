package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.sound.midi.Soundbank;
import java.util.List;

public class HW3 {
    /*Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header*/
    public static String url = "https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCategories = driver.findElement(By.id("gh-cat"));
        Select select = new Select(allCategories);
        List<WebElement> categories = select.getOptions();
        for (WebElement category : categories) {
            String categoryText = category.getText();
            System.out.println(categoryText);
        }
        select.selectByValue("58058");
        Thread.sleep(2000);
        driver.findElement(By.id("gh-btn")).click();
        String header = driver.getTitle();
        System.out.println(header);

        driver.quit();
    }
}
