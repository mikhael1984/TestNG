package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class SumTest extends BaseTest {

    @BeforeTest
    public void prepare(){
        System.out.println("Sum test started");
    }

    @AfterTest
    public void finish(){
        System.out.println("Sum test finished");
    }

    @Test
    public void onePointThreeSumOnePointTwo(){
        double result = calculator.sum(1.3, 1.2);
        Assert.assertEquals(result, 2.5, "Incorrect sum operation");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void zeroPointZeroSumZeroDivZero(){
        double result = calculator.sum(0.0, 1/0);
    }



}
