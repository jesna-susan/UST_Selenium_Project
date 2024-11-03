package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class FileDownload {
    public static void main(String[] args) {

        Map<String, String> capabilities = new HashMap<>();
        capabilities.put("download.default_directory", System.getProperty("user.dir") + "\\src\\test\\resources");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", capabilities);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/download");
        driver.manage().window().maximize();

        WebElement fileLink = driver.findElement(By.xpath("//a[text()='photo.png']"));
        fileLink.click();

    }
}
