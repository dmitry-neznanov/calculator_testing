package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangentTest extends BaseTest {

    @Test(dataProvider = "valuesForCtg")
    public void ctgTest(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of ctg operation!");
    }

    // Хз че должно быть

    @DataProvider(name = "valuesForCtg")
    public Object[][] values() {
        return new Object[][]{
                {5, -0.29581291553},
                {100, -1.70295691943},
                {0, 0},
                {-3, 7.01525255143}
        };
    }
}
