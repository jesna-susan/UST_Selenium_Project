package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class draganddrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);

        List<WebElement> sources =driver.findElements(By.xpath("//ul[@id='gallery']//li"));
        WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));

        Actions action =new Actions(driver);
        for( WebElement source: sources) {
            action.dragAndDrop(source, target).pause(1000).build().perform();
        }

        driver.switchTo().defaultContent();
    }
}
