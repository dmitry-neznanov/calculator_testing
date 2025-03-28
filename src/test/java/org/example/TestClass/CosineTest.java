package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineTest extends BaseTest {

    @Test(dataProvider = "valuesForCos")
    public void cosTest(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of cos operation!");
    }

// Результат синус а не косинус

    @DataProvider(name = "valuesForCos")
    public Object[][] values() {
        return new Object[][]{
                {5, 0.28366218546},
                {100, 0.86231887228},
                {0, 1},
                {-3, -0.9899924966}
        };
    }
}
