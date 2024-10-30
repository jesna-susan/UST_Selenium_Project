package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Handlingmultiplewindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        WebElement searchBtn = driver.findElement(By.id("gh-btn"));

        searchBox.sendKeys("TV");
        searchBtn.click();


        WebElement link = driver.findElement(By.xpath("//ul[contains(@class,'srp-results')]//div[@class='s-item__title']"));
        link.click();

        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

        Set<String> allWindow = driver.getWindowHandles();

        for(String window : allWindow){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }

        WebElement title = driver.findElement(By.xpath("//h1[@class='x-item-title__mainTitle']/span"));
        System.out.println(title.getText());

        WebElement price = driver.findElement(By.xpath("//div[@class='x-price-primary']/span"));
        System.out.println(price.getText());

        driver.close();
        driver.switchTo().window(currentWindow);
    }
}
