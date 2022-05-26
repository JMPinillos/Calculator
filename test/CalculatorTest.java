import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    //METODO QUE COMPRUEBA SI LA MULTIPLICACION DE DOS NUMEROS ES CORRECTA
    @Test
    public void multiplyTest(){
        //arrange
        double result = 19;
        double number1 = 10;
        double number2 = 1.9;

        Calculator calculator = new Calculator();

        //act
        double calc = calculator.multiply(number1,number2);

        //assert
        assertEquals(result, calc);
    }
}