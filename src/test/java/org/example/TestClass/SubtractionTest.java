package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest {

    @Test(dataProvider = "valuesForSub")
    public void subTest(double a,double b, double expectedResult) {
        double result = calculator.sub(a,b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sub operation!");
    }

    @DataProvider(name = "valuesForSub")
    public Object[][] values() {
        return new Object[][]{
                {10, 2, 8},
                {-1, 4, -5},
                {0, 0, 0},
                {1000000, 5000000, -4000000},
                {-5,-3,-2},
                {2.5, 1.5, 1}
        };
    }
}
