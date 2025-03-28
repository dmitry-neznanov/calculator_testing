package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTest extends BaseTest {

    @Test(dataProvider = "valuesForMult")
    public void multTest(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesForMult")
    public Object[][] values() {
        return new Object[][]{
                {5, 2, 10},
                {-1, 4, -4},
                {0, 0, 0},
                {1000000, 5, 5000000},
                {-5, -4, 20},
                {2.5, 1.5, 3.0}
        };
    }
}
