package com.learning.core.day10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P08 {
	@Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.div(6, 3);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        Calculator calculator = new Calculator();
        calculator.div(6, 0);
    }
}
