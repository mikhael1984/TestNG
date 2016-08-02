package com.epam.module3;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void config() {
        System.out.println("Config prepare calculator");
        calculator = new Calculator();
    }

    @AfterClass
    public void done() {
        System.out.println("==============================");
    }

    protected void RunTestTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }

}
