package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @Test(dataProvider = "valuesForPow")
    public void powTest(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of pow operation!");
    }

    @DataProvider(name = "valuesForPow")
    public Object[][] values() {
        return new Object[][]{
                {5, 3, 125},
                {-3, 5, -243},
                {0, 0, 1},
                {-5, -3, -0.008}
        };
    }
}
