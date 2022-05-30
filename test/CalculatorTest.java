import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    //METODO QUE COMPRUEBA SI LA RAIZ CUADRADA DE UN NUMERO ES CORRECTA CON UN ERROR DE 10^-3
    @Test
    public void squareRootTest(){
        // arrange

        double result = 3.16227766;
        double number = 10;

        Calculator calculator = new Calculator();

        // act

        double squareRoot = calculator.sqrt(number);

        //assert

        assertTrue(result-squareRoot <= 0.001);
    }
}
