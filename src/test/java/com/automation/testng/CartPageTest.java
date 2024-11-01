package com.automation.testng;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {

    @Test(groups = {"Smoke"})
    public void userCanAddToCart(){
        System.out.println("Test Case 1 cart");
    }

    @Test(groups = {"Regression"})
    public void userCanRemoveItemFromCart(){
        System.out.println("Test Case 2 cart");
    }

    @Test(groups = {"Regression"})
    public void userCanUpdateQuantityOfItem(){
        System.out.println("Test Case 1 order");
    }
}
