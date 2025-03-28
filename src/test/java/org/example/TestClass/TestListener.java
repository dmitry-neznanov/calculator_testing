package org.example.TestClass;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("Test starts: " + result.getName() + " with "+ Arrays.toString(result.getParameters()));
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is success: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test is failure: " + result.getName());
    }

}
