package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightSiteExample extends BaseTestFlightSite {
    @Test
    public void flightExample(){
        driver.findElement(By.xpath("//span[@class=\"uitk-tab-text\" and text()='Flights']")).click();
        //driver.findElement(By.id("flight-type-one-way-label-hp-flight")).click();
        driver.findElement(By.xpath("//span[@class='uitk-tab-text' and text()='One-way']")).click();
        driver.findElement(By.xpath("//div[@class=\"uitk-field has-floatedLabel-label has-icon\"]/button[@aria-label='Leaving from']")).click();
        WebElement source= driver.findElement(By.xpath("//div[@class='uitk-field has-no-visible-label has-placeholder']/input"));
        //source.clear();
        source.sendKeys("bangalore");

        WebElement destination = driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon']/button[@aria-label='Going to']"));
        destination.clear();
        destination.sendKeys("Mumbai");






    }

}
