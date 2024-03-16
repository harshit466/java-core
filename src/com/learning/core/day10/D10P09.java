package com.learning.core.day10;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P09 {
    @Test
    public void testFindMax() {
        Calculator calculator = new Calculator();
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        assertEquals(6, calculator.findMax(arr1));

        int[] arr2 = {-1, -2, -3, -4, -5, -6};
        assertEquals(-1, calculator.findMax(arr2));
    }
}
