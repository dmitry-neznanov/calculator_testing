package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentTest extends BaseTest {

    @Test(dataProvider = "valuesForTan")
    public void sinTest(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of tan operation!");
    }

    // Какая то хуйня выходит

    @DataProvider(name = "valuesForTan")
    public Object[][] values() {
        return new Object[][]{
                {5, -3.38051500625},
                {100, -0.58721391515},
                {0, 0},
                {-3, 0.14254654307}
        };
    }
}
