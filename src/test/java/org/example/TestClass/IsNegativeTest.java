package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @Test
    public void isNegativeWithNegativeNumberTest() {
        boolean result = calculator.isNegative((int) ((Math.random() * 5) * - 1) - 1);
        Assert.assertTrue(result, "Invalid result of isNegative operation!");
    }

    @Test(dataProvider = "valuesForIsNegative")
    public void isNegativeWithPositiveNumberTest(long a) {
        boolean result = calculator.isNegative(a);
        Assert.assertFalse(result, "Invalid result of isNegative operation!");
    }

    @DataProvider(name = "valuesForIsNegative")
    public Object[][] values() {
        return new Object[][]{
                {1},
                {0},
        };
    }
}
