package com.automation.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTestFlightSite {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod(alwaysRun = true)
    public void setUp(){

        driver.manage().window().maximize();
        driver.get("https://www.expedia.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }
    @AfterMethod(alwaysRun = true)
    public void cleanUp(){
        driver.quit();


    }
}
