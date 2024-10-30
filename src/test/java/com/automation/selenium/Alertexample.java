package com.automation.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//li/button[text()='Click for JS Alert']")).click();
        Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//li/button[text()='Click for JS Confirm']")).click();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.dismiss();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//li/button[text()='Click for JS Prompt']")).click();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        alert.sendKeys("Hello");
        Thread.sleep(1000);
        alert.accept();
        Thread.sleep(1000);


    }
}
