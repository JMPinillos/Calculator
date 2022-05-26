import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void subtractTest(){
        //arrange
        float result = 5;
        float number1 = 10;
        float number2 = 5;

        Calculator calculator = new Calculator();

        //act
        float calc = calculator.subtract(number1,number2);

        //assert
        assertEquals(result, calc);
    }

    public float subtract(float num1, float num2){
        return num1-num2;
    }
}