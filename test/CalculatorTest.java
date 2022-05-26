import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //METODO QUE COMPRUEBA SI LA SUMA DE DOS NUMEROS ES CORRECTA
    @Test
    public void addTest(){
        //arrange
        double result = 7;
        double number1 = 2;
        double number2 = 5;

        Calculator calculator = new Calculator();

        //act
        double calc = calculator.add(number1,number2);

        //assert
        assertEquals(result, calc);
    }
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
}