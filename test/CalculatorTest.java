import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    //METODO QUE COMPRUEBA SI LA SUMA DE DOS NUMEROS ES CORRECTA
    @Test
    public void addTest(){
        //arrange
        class ChainData{
            double result;
            double number1;
            double number2;
            ChainData(double number1, double number2, double result) {
                this.number1 = number1;
                this.number2 = number2;
                this.result = result;
            }
        }

        ChainData[] tests = {
                new ChainData(2, 5,7),
                new ChainData(-3, -7, -10),
                new ChainData(-2,10,8),
                new ChainData(1.5,1,2.5),
        };

        Calculator calculator = new Calculator();

        //act
        double calc;

        for(ChainData test : tests) {
            calc = calculator.add(test.number1, test.number2);
            //assert
            assertEquals(test.result, calc);
        }
    }
    //METODO QUE COMPRUEBA SI LA RESTA DE DOS NUMEROS ES CORRECTA
    @Test
    public void subtractTest(){
        //arrange
        class ChainData{
            double result;
            double number1;
            double number2;
            ChainData(double number1, double number2, double result) {
                this.number1 = number1;
                this.number2 = number2;
                this.result = result;
            }
        }

        ChainData[] tests = {
                new ChainData(2, 5,-3),
                new ChainData(-3, -7, 4),
                new ChainData(-2,10,-12),
                new ChainData(1.5,0.5,1),
        };

        Calculator calculator = new Calculator();

        //act
        double calc;

        for(ChainData test : tests) {
            calc = calculator.subtract(test.number1, test.number2);
            //assert
            assertEquals(test.result, calc);
        }
    }

    //METODO QUE COMPRUEBA SI LA MULTIPLICACION DE DOS NUMEROS ES CORRECTA
    @Test
    public void multiplyTest(){
        //arrange
        class ChainData{
            double result;
            double number1;
            double number2;
            ChainData(double number1, double number2, double result) {
                this.number1 = number1;
                this.number2 = number2;
                this.result = result;
            }
        }

        ChainData[] tests = {
                new ChainData(2, 5,10),
                new ChainData(-3, -7, 21),
                new ChainData(-2,10,-20),
                new ChainData(1.5,2,3),
        };

        Calculator calculator = new Calculator();

        //act
        double calc;

        for(ChainData test : tests) {
            calc = calculator.multiply(test.number1, test.number2);
            //assert
            assertEquals(test.result, calc);
        }
    }

    //METODO QUE COMPRUEBA SI LA DIVISION DE DOS NUMEROS ES CORRECTA
    @Test
    public void divideTest(){
        //arrange
         class ChainData{
             double result;
             double number1;
             double number2;
             ChainData(double number1, double number2, double result) {
                 this.number1 = number1;
                 this.number2 = number2;
                 this.result = result;
            }
        }

        ChainData[] tests = {
                new ChainData(10, -2,-5),
                new ChainData(50, 0, 0),
                new ChainData(15,10,1.5),
                new ChainData(0,10,0),
        };

        Calculator calculator = new Calculator();

        //act
        double calc;
        for(ChainData test : tests) {
            try {
                calc = calculator.divide(test.number1, test.number2);
                //assert
                assertEquals(test.result, calc);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Método que comprueba si la raíz cuadrada de un número es correcta
    @Test
    public void squareRootTest(){
        // arrange

        double result;
        double number;
        class ChainData{
            double result;
            double number;

            ChainData(double number, double result) {
                this.number = number;
                this.result = result;
            }
        }

        ChainData[] tests = {
                new ChainData(10, 3.16227766),
                new ChainData(-10, -3.16227766),
                new ChainData(4,2),
                new ChainData(0,0),
        };

        Calculator calculator = new Calculator();

        // act
        double calc;
        for(ChainData test : tests) {
            try {
                calc = calculator.sqrt(test.number);
                //assert
                assertTrue(test.result-calc <= 0.001);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}