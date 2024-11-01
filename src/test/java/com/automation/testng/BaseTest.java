package com.automation.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        System.out.println("Before suite.");
    }

    @AfterSuite(alwaysRun = true)
    public void cleanUp(){
        System.out.println("After suite.");
    }
}
