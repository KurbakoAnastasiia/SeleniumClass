package com.company.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    /*Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser*/
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
        Thread.sleep(2000);
        WebElement monthDD = driver.findElement(By.name("birthday_month"));
        Select selectMonth = new Select(monthDD);
        List<WebElement> allMonths = selectMonth.getOptions();
        int sizeMonthDD = allMonths.size();
        if (sizeMonthDD == 12) {
            System.out.println("Month DropDowns has 12 month options");
        } else {
            System.out.println("Invalid quantity of month options");
            System.out.println(sizeMonthDD);
        }
        WebElement dayDD = driver.findElement(By.id("day"));
        Select selectDay = new Select(dayDD);
        List<WebElement> allDays = selectDay.getOptions();
        int sizeDayDD = allDays.size();
        if (sizeDayDD == 31) {
            System.out.println("Day DropDowns has 31 day options");
        } else {
            System.out.println("Invalid quantity of day options");
        }
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        List<WebElement> allYears = selectYear.getOptions();
        int sizeYearDD = allYears.size();
        if (sizeYearDD == 115) {
            System.out.println("Day DropDowns has 115 year options");
        } else {
            System.out.println("Invalid quantity of year options " + selectYear);
            System.out.println(sizeYearDD);
        }
        selectMonth.selectByValue("11");
        Thread.sleep(2000);
        selectDay.selectByVisibleText("4");
        Thread.sleep(2000);
        selectYear.selectByValue("1989");
        Thread.sleep(2000);

        driver.quit();

    }
}
