package calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void should_CalculateRectangleCircumference_When_GivenWidthAndHeight() {
        Assert.assertEquals(8, calculator.CalculateRectCirc(2,2));
    }

    @Test
    public void should_CalculatePowerOfTwoNumbers() {
        Assert.assertEquals(512.0, calculator.powerTwoNumbers(8.0, 3.0), 0.0001);
    }

    @Test
    public void should_CalculateSquareRoot_When_GivenPositiveNumber() {
        Assert.assertEquals(19.0, calculator.sqrt(361.0), 0.0001);
    }

    @Test
    public void should_CalculateSquareArea_When_GivenSideLength() {
        Assert.assertEquals(64.0, calculator.CalculateSquareArea(8), 0.0001);
    }

    @Test
    public void should_CalculateRectangleArea_When_GivenWidthAndHeight() {
        Assert.assertEquals(56.0, calculator.CalculateRectArea(8, 7), 0.0001);
    }

    @Test
    public void should_CalculateSquareCircumference_When_GivenSideLength() {
        Assert.assertEquals(32, calculator.CalculateSquareCirc(8));
    }

    @Test
    public void should_CalculateTriangleArea_When_GivenBaseAndHeight() {
        Assert.assertEquals(28.0, calculator.CalculateTriangleArea(8, 7), 0.0001);
    }

    @Test
    public void should_CalculateTriangleCircumference_When_GivenThreeSides() {
        Assert.assertEquals(19.0, calculator.CalculateTriangleCirc(8, 7, 4), 0.0001);
    }

    @Test
    public void should_ConvertCelsiusToFahrenheit_When_GivenTemperatureInCelsius() {
        Assert.assertEquals(46.4, calculator.convertCelsiusToFarenheit(8), 0.0001);
    }

    @Test
    public void should_ConvertFahrenheitToCelsius_When_GivenTemperatureInFahrenheit() {
        Assert.assertEquals(8.0, calculator.convertFarenheitToCelsius(46), 0.0001);
    }

    @Test
    public void should_ConvertMilesPerHourToKilometersPerHour() {
        Assert.assertEquals(80.5, calculator.convertFromMphToKph(50), 0.0001);
    }

    @Test
    public void should_CalculateFactorial_When_GivenPositiveNumber() {
        Assert.assertEquals(6, calculator.factorial(3));
    }

    @Test
    public void should_CalculateFibonacciNumber_When_GivenIndex() {
        Assert.assertEquals(233, calculator.fibbonacci(13));
    }

    @Test
    public void should_FindGCD_When_GivenTwoNumbers() {
        Assert.assertEquals(6, calculator.findGCD(54,24));
    }

    @Test
    public void should_FindLCM_When_GivenTwoNumbers() {
        Assert.assertEquals(216, calculator.findLCM(54,24));
    }

    @Test
    public void should_ReturnTrue_When_NumberIsPrime() {
        Assert.assertTrue(calculator.isPrime(7));
    }

    @Test
    public void should_ReturnFalse_When_NumberIsNotPrime() {
        Assert.assertFalse(calculator.isPrime(1));
        Assert.assertFalse(calculator.isPrime(16));
    }
}