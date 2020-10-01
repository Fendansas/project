package by.danilchik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    /*@Test
    public void TestCalculatorPlus() {
        //GIVEN
        double expectedResult = 10;
        //WHEN
        double calculationResult = calculator.plus();
        //THEN
        assertEquals(expectedResult,calculationResult,0.1);


        }

    }

     */

    @Test
    public void summarizesTwoNumbers() {
        systemInMock.provideLines("1", "2");
        assertEquals(3, calculator.plus());
    }