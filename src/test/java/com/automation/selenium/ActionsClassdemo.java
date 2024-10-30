package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassdemo {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        //hover on the electronics section and then from the drop down click on apple.

        WebElement electronicsLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement apple =driver.findElement(By.xpath("//li/a[text()='Apple']"));

        Actions action = new Actions(driver);
        action.moveToElement(electronicsLink).pause(2000).click(apple).build().perform();

        // pausing because in the selenium it happens fast but in the actual website after hover there is a lag for the drop-down to appear.

        WebElement signIn = driver.findElement(By.xpath("//span[@id='gh-ug']//a[text()='Sign in']"));
        action.keyDown(Keys.CONTROL).click(signIn).keyUp(Keys.CONTROL).build().perform();
    }
}
