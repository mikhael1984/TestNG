package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class MultiplicationAndPowerTest extends BaseTest {

    @BeforeTest
    public void prepare(){
        System.out.println("Multiplication and power test started");
    }

    @AfterTest
    public void finish(){
        System.out.println("Multiplication and power test finished");
    }

    @Test
    public void onePointSixMultTwo(){
        double result = calculator.mult(1.6,2);
        Assert.assertEquals(result, 3.2, "Incorrect multiplication operation:");
    }

    @Test (expectedExceptions = ArithmeticException.class, groups = "Negative")
    public void nineMultOneDividedByZero(){
        double result = calculator.mult(9,1/0);
    }

    @Test
    public void fourPowTwoPointFive(){
        double result = calculator.pow(4, 2.5);
        Assert.assertEquals(result, 32.0, "Incorrect power operation:");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Negative")
    public void sqrtMinusThirtySix(){
        double result = calculator.sqrt(-36);
        Assert.assertEquals(result, 6.0, "Incorrect power operation:");
    }







}
