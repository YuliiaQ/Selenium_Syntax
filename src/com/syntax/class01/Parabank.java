package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Parabank {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            new Actions(driver).moveToElement(driver.findElement(By.xpath("//input[@id='customer.firstName']"))).perform();
            driver.findElement(By.id("customer.firstName")).sendKeys("Darth");
            driver.findElement(By.id("customer.lastName")).sendKeys("Wader");
            driver.findElement(By.id("customer.address.street")).sendKeys("Earth");
            driver.findElement(By.id("customer.address.city")).sendKeys("Darth");
            driver.findElement(By.id("customer.address.state")).sendKeys("Darth");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("Darth");
            driver.findElement(By.id("customer.phoneNumber")).sendKeys("Darth");
            driver.findElement(By.id("customer.ssn")).sendKeys("Darth");
            driver.findElement(By.id("customer.username")).sendKeys("Darth");
            driver.findElement(By.id("customer.password")).sendKeys("Darth");
            driver.findElement(By.id("repeatedPassword")).sendKeys("Darth");
            driver.findElement(By.className("button")).click();
            Thread.sleep(3000);
        } catch (Throwable t) {

        }
        driver.quit();
    }
}

