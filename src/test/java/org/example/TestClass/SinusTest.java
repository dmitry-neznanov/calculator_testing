package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinusTest extends BaseTest {

    @Test(dataProvider = "valuesForSin")
    public void sinTest(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of sin operation!");
    }

    @DataProvider(name = "valuesForSin")
    public Object[][] values() {
        return new Object[][]{
                {5, -0.9589242746631385},
                {100, -0.5063656411097588},
                {0, 0},
                {-3, 1}
        };
    }
}
