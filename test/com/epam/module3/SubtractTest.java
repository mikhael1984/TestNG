package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class SubtractTest extends BaseTest {

    @BeforeTest
    public void prepare(){
        System.out.println("Subtract test started");
    }

    @AfterTest
    public void finish(){
        System.out.println("Subtract test finished");
    }

    @Test
    public void TwoPointSixNineSubtractOnePointThreeThree(){
        double result = calculator.sub(2.69, 1.33);
        Assert.assertEquals(result, 1.36, "Incorrect subtract operation");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void minusOneDivZeroSubtractNineDivZero(){
        double result = calculator.sub(-1/0, 9/0);
    }


}
