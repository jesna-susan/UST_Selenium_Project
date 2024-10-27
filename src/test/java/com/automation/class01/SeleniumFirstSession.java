package com.automation.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumFirstSession {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //1. login
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        List<WebElement> loginBtn = driver.findElements(By.id("login-button"));
        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginBtn.get(0).click();

        //2. homepage
        String expectedTitle = "Swag Labs"; // This is the expected title of the SauceDemo homepage.
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Successfully navigated to the homepage.");
        } else {
            System.out.println("Failed to navigate to the homepage.");
        }

        // 3. Print list of product names and prices
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        System.out.println("List of Products and Prices:");
        for (WebElement product : products) {
            String productName = product.findElement(By.className("inventory_item_name")).getText();
            String productPrice = product.findElement(By.className("inventory_item_price")).getText();
            System.out.println("Product: " + productName + " | Price: " + productPrice);
        }

        // Step 4: Click "Add to Cart" button for the first item
        WebElement firstAddToCartButton = products.get(0).findElement(By.tagName("button"));
        firstAddToCartButton.click();

        // Step 5: Click on the cart icon
        driver.findElement(By.className("shopping_cart_link")).click();

        // Step 6: Print product name and price from the cart page
        WebElement cartItem = driver.findElement(By.className("cart_item"));
        String cartItemName = cartItem.findElement(By.className("inventory_item_name")).getText();
        String cartItemPrice = cartItem.findElement(By.className("inventory_item_price")).getText();
        System.out.println("Cart Product: " + cartItemName + " | Cart Price: " + cartItemPrice);


    }






}

