package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ebay {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebElement searchBar =driver.findElement(By.id("gh-ac"));
        searchBar.sendKeys("TV");
        driver.findElement(By.id("gh-btn")).click();

        List<WebElement> items = driver.findElements(By.cssSelector(".s-item")); // Select all search result items

        System.out.println("List of TVs and Prices:");
        for (WebElement item : items) {
            try {
                String itemName = item.findElement(By.cssSelector(".s-item__title")).getText();
                String itemPrice = item.findElement(By.cssSelector(".s-item__price")).getText();
                System.out.println("Product: " + itemName + " | Price: " + itemPrice);
            } catch (Exception e) {
                // Skip items that might not have a price or name
                System.out.println("Some items may not have a proper title or price.");
            }
        }

//        List<WebElement> products=driver.findElements(By.className("s-item"));
//        System.out.println("List of tvs with their price:");
//        for(WebElement product: products){
//            try {
//                String productName = product.findElement(By.className("s-item__title")).getText();
//                String productPrice = product.findElement(By.className("s-item__price")).getText();
//                System.out.println("Product Title:" + productName + "| Price: " + productPrice);
//            }
//            catch(Exception e){
//                System.out.println("Some items may not have a proper title or price.");
//                System.out.println(product.getAttribute("outerHTML"));
//            }
//        }

    }
}
