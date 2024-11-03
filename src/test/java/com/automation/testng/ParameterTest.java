package com.automation.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Parameters({"username","password"})
    @Test(groups = "Smoke", dataProvider = "getInvalidData")
    public void verifyUserCanPassParameter(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getInvalidData(){
        String[][] credentials ={
                {"demo","demo23"},
                {"admin","admin123"},
                {"adminHi","admin1w23"}
        };
        return credentials;
    }
}
