import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //METODO QUE COMPRUEBA SI LA SUMA DE DOS NUMEROS ES CORRECTA
    @Test
    public void addTest(){
        //arrange
        float result = 7;
        float number1 = 2;
        float number2 = 5;

        Calculator calculator = new Calculator();

        //act
        float calc = calculator.add(number1,number2);

        //assert
        assertEquals(result, calc);
    }

    @Test
    public void multiplyTest(){
        //arrange
        double result = 8.1;
        double number1 = 10;
        double number2 = 1.9;

        Calculator calculator = new Calculator();

        //act
        double calc = calculator.multiply(number1,number2);

        //assert
        assertEquals(result, calc);
    }
}