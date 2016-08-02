package com.epam.module3;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
public class TrigonometryTest extends BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
    }

    @BeforeTest
    public void prepare(){
        System.out.println("Trigonometry test started");
    }

    @AfterTest
    public void finish(){
        System.out.println("Trigonometry test finished");
    }

    @Test
    public void sinPIDiv2(){
        double result = calculator.sin(Math.PI/2);
        Assert.assertEquals(result, 1.0, "Incorrect sine operation:");
    }

    @Test
    public void cosPIDiv2(){
        double result = calculator.cos(Math.PI/2);
        Assert.assertEquals(result, 0.0, "Incorrect cosine operation:");
    }

    @Test
    public void tgPI(){
        double result = calculator.tg(Math.PI);
        Assert.assertEquals(result, 0.0, "Incorrect tangent operation:");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Negative")
    public void ctgPI(){
        double result = calculator.ctg(Math.PI);
        Assert.assertEquals(result, 0.0, "Incorrect cotangent operation:");
    }

}
