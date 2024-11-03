package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement fileUploadBtn = driver.findElement(By.id("file-upload"));
        fileUploadBtn.sendKeys(System.getProperty("user.dir") + "\\src\\test\\resources\\screenshot.png");

        driver.findElement(By.id("file-submit")).click();
    }
}