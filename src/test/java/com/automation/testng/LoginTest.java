package com.automation.testng;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(groups = {"Smoke"})
    public void verifyUserLogin(){
        System.out.println("Test Case 1 login");
    }

    @Test(groups = {"Regression"})
    public void verifyUserCannotLoginWithInvalidCred(){
        System.out.println("Test Case 2 login");
    }
}
