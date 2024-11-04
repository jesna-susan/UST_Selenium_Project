package com.automation.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTestFlightSite {
    WebDriver driver = new ChromeDriver();
    @BeforeTest(alwaysRun = true)
    public void setUp(){

        driver.manage().window().maximize();
        driver.get("https://www.expedia.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }
    @AfterTest(alwaysRun = true)
    public void cleanUp(){
        driver.quit();


    }
}
