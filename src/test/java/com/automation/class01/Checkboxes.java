package com.automation.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBx1 = driver.findElement(By.xpath("//form//input[@type='checkbox'][1]"));
        WebElement checkBx2 = driver.findElement(By.xpath("//form//input[@type='checkbox'][2]"));

        if (!checkBx1.isSelected()) {
            checkBx1.click();
        }

        if (!checkBx2.isSelected()) {
            checkBx2.click();
        }
    }
}
