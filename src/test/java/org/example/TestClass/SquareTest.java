package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareTest extends BaseTest {

    @Test(dataProvider = "valuesForSqrt")
    public void sqrtTest(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of sqrt operation!");
    }

    @DataProvider(name = "valuesForSqrt")
    public Object[][] values() {
        return new Object[][]{
                {5, 2.23606797749979},
                {100, 10},
                {0, 0},
                {-5, 2.23606797749979}
        };
    }
}
