package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {

    @Test
    public void isPositiveWithPositiveNumberTest() {
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result, "Invalid result of isPositive operation!");
    }

    @Test
    public void isPositiveWithNegativeNumberTest() {
        boolean result = calculator.isPositive(-1);
        Assert.assertFalse(result, "Invalid result of isPositive operation!");
    }

    @Test
    public void isPositiveWithZeroNumberTest() {
        boolean result = calculator.isPositive(0);
        Assert.assertFalse(result, "Invalid result of isPositive operation!");
    }
}
