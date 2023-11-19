package notation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
    @Test
    public void shouldCalculateAddition() {
        int result = calculator.calculatePolishNotation("2 3 +");
        assertEquals(5, result);
    }

    @Test
    public void shouldCalculateNegation(){
        int result = calculator.calculatePolishNotation("2 3 -");
        assertEquals(-1, result);
    }

    @Test
    public void shouldCalculateMultiplication(){
        int result = calculator.calculatePolishNotation("2 3 *");
        assertEquals(6, result);
    }

    @Test
    public void shouldCalculateDataWithMultipleSpaces() {
        int result = calculator.calculatePolishNotation("2     3      *  ");
        assertEquals(6, result);
    }

    @Test
    public void shouldCalculateNegativeNumbers() {
        int result = calculator.calculatePolishNotation("-2     3      *  ");
        assertEquals(-6, result);
    }
}