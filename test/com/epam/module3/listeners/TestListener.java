package com.epam.module3.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class TestListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Method started: " + method.getTestMethod().getMethodName());

    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Method finished [" + testResult.getStatus() + "]: " + method.getTestMethod().getMethodName() + "\n");
    }
}
