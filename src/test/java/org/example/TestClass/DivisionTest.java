package org.example.TestClass;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {

    @Test(dataProvider = "valuesForDiv")
    public void divTest(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of div operation!");
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void divByZeroTest()  {
        calculator.div(5, 0);
    }

    @DataProvider(name = "valuesForDiv")
    public Object[][] values() {
        return new Object[][]{
                {10, 2, 5},
                {6, 4, 1.5},
                {5000000, 1000000, 5},
                {-5, -3, 1.6666666666666667}
        };
    }
}
