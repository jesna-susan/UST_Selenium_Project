package com.automation.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {
    @Test(priority = 1, groups = {"Smoke"})
    public void verifyUserLogin(){
        System.out.println("Test Case 1 login");
    }

    @Test(priority = 2, groups={"Smoke"})
    public void verifyUseCanLogout(){
        System.out.println("Test case 2 login");
        SoftAssert softAssert =new SoftAssert();
        //softAssert.assertEquals("10","11");
        softAssert.assertEquals("10","10");
        //softAssert.assertEquals("10","19");
        softAssert.assertAll();

    }

    @Test(priority = 3, groups = {"Regression"})
    public void verifyUserCannotLoginWithInvalidCred(){
        System.out.println("Test Case 3 login");
        Assert.assertTrue("Test".equals("Test"), "Expected and actual");
        Assert.assertEquals("ghi","gh");
    }
}
