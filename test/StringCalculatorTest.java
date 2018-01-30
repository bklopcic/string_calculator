import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void addSpecialCaseTest()
    {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("");

        assertEquals(0, result, "Failed on empty string");
    }

    @Test
    void singleDigitAddTest()
    {
        StringCalculator calculator = new StringCalculator();

        String[] testVals = {"-9999", "-1", "0", "000", "1", "7", "2147483647"};
        for (int  i = 0; i < testVals.length; i++) {
            assertEquals(Integer.parseInt(testVals[i]), calculator.add(testVals[i]), "Failed to add single number");
        }
    }

    @Test
    void twoNumberAddTest()
    {
        StringCalculator calculator = new StringCalculator();

        assertEquals(-19998, calculator.add("-9999,-9999"), "Failed to add two numbers");
        assertEquals(0, calculator.add("1,-1"), "Failed to add two numbers");
        assertEquals(-2, calculator.add("-1,-1"), "Failed to add two numbers");
        assertEquals(2, calculator.add("1,1"), "Failed to add two numbers");
        assertEquals(0, calculator.add("0,0"), "Failed to add two numbers");
        assertEquals(23, calculator.add("7,16"), "Failed to add two numbers");
        assertEquals(64197, calculator.add("9876,54321"), "Failed to add two numbers");
    }
}