import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void add() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("");

        assertEquals(0, result, "Failed on empty string");
    }
}