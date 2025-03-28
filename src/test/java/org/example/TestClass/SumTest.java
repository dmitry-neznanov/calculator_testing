package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @Test(dataProvider = "valuesForSum")
    public void sumTest(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum operation!");

    }

    @DataProvider(name = "valuesForSum")
    public Object[][] values() {
        return new Object[][]{
                {10, 2, 12},
                {-1, 4, 3},
                {0, 0, 0},
                {1000000, 5000000, 6000000},
                {-5, -3, -8},
                {1.5, 2.5, 4}
        };
    }


}
