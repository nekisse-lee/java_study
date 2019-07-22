package java8;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    public void testCalculateAddition() throws Exception {
        Calculation calculatorService = (i1,i2) -> i1 + i2;

        int actual = calculatorService.calculate(1, 1);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    public void testCalculateSubtraction() throws Exception {
        Calculation calculatorService = new Subtranction();

        int actual = calculatorService.calculate(1, 1);

        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void testCalculateMultiplication() throws Exception {
        Calculation calculatorService = new  Multiplication();

        int actual = calculatorService.calculate(1, 1);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCalculateDivision() throws Exception {
        Calculation calculatorService = new Division();

        int actual = calculatorService.calculate(8, 0);

        assertThat(actual).isEqualTo(2);
    }


}
