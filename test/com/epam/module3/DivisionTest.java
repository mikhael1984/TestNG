package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class DivisionTest extends BaseTest {

    @BeforeTest
    public void prepare(){
        System.out.println("Division test started");
    }

    @AfterTest
    public void finish(){
        System.out.println("Division test finished");
    }

    @Test
    public void NineDivThree(){
        double result = calculator.div(9, 3);
        Assert.assertEquals(result, 3.0, "Incorrect division operation");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Negative")
    public void SixDivZero(){
        double result = calculator.div(6,0);
    }
}
