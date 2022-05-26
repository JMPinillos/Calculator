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

    //METODO QUE COMPRUEBA SI LA DIVISION DE DOS NUMEROS ES CORRECTA
    @Test
    public void divideTest(){
        //arrange
        double result = -2.5;
        double number1 = 5;
        double number2 = -2;

        Calculator calculator = new Calculator();

        //act
        double calc = calculator.divide(number1,number2);

        //assert
        assertEquals(result, calc);
    }
}