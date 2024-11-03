package com.automation.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("====>"+ result.getThrowable().toString());
//        if(result.getThrowable().getCause().getMessage().contains("Assertion")){
//            System.out.println("Attaching screenshot");

    }
}
