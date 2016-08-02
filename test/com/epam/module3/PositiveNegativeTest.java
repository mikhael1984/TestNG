package com.epam.module3;

import com.epam.module3.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Mikhail_Mereminskiy on 8/1/2016.
 */
@Listeners(TestListener.class)
public class PositiveNegativeTest extends BaseTest{

    private long value;

    private boolean shouldBePositive;

    private boolean shouldBeNegative;

    @DataProvider(name = "PositiveNegativeProvider")
    public  static Object[][] checkedValues(){
        return new Object[][]{
                {68, true, false},
                {-5, false, true},
                {0, false, false},
                {-0, false, false}
        };
    }

    @Factory(dataProvider = "PositiveNegativeProvider")
    public PositiveNegativeTest(long value, boolean shouldBePositive, boolean shouldBeNegative){
        this.value = value;
        this.shouldBePositive = shouldBePositive;
        this.shouldBeNegative = shouldBeNegative;
    }

    @Test
    public void checkPositive(){

        Assert.assertTrue(calculator.isPositive(value) == shouldBePositive);
    }

    @Test
    public void checkegative(){
        Assert.assertTrue(calculator.isNegative(value) == shouldBeNegative);
    }

}
