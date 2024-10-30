package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iframe {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        //switch to iframe
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);

        List<WebElement> images=driver.findElements(By.xpath("//ul[@id='gallery']//li"));
        int length=images.size();
        System.out.println(length);

        //switch back to default content
        driver.switchTo().defaultContent();
    }

}
