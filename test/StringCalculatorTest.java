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
    void addTest()
    {
        StringCalculator calculator = new StringCalculator();

        //single number
        String[] testVals = {"-9999", "-1", "0", "000", "1", "7", "2147483647"};
        for (int  i = 0; i < testVals.length; i++) {
            assertEquals(Integer.parseInt(testVals[i]), calculator.add(testVals[i]), "Failed to add single number");
        }
    }
}