package com.automation.testng;

import org.testng.annotations.*;

public class OrderConfirmationTest extends BaseTest{


    @Test(groups = {"Smoke"})
    public void userCanPlaceOrder(){
        System.out.println("Test Case 1 order");
    }

    @Test(groups = {"Regression"})
    public void userCanCancelOrder(){
        System.out.println("Test Case 2 order");
    }
}
