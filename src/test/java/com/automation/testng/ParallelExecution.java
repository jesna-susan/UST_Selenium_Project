package com.automation.testng;

import org.testng.annotations.Test;

public class ParallelExecution {

    @Test
    public void TestMethod1() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Method 1");
    }

    @Test
    public void TestMethod2() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Method 2");
    }

    @Test
    public void TestMethod3() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Method 3");
    }

}
