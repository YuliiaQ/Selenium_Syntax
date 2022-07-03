package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();
            driver.get("http://www.fb.com");
            Thread.sleep(5000);
            driver.findElement(By.linkText("Create New Account")).click();
            Thread.sleep(3000);
            driver.findElement(By.name("firstname")).sendKeys("gfhj");
            driver.findElement(By.name("lastname")).sendKeys("gfhj");
            driver.findElement(By.name("reg_email__")).sendKeys("gfhj");
            driver.findElement(By.id("password_step_input")).sendKeys("IL0veJ@v@");
            driver.findElement(By.name("birthday_month")).sendKeys("May");
            driver.findElement(By.name("birthday_day")).sendKeys("7");
            Thread.sleep(5000);
            driver.findElement(By.id("year")).sendKeys("1970");
            Thread.sleep(5000);
            driver.findElement(By.className("_58mt")).click();
            Thread.sleep(5000);
            driver.findElement(By.partialLinkText("Sign Up")).click();
            Thread.sleep(5000);

        } catch (Throwable t) {

        }
        driver.quit();
    }
}
