public class Calculator {

    // Método para calcular la raíz cuadrada de un número de precisión doble.

    public double sqrt(double num1){
        int antSqrt = 0;
        int postSqrt = 0;
        double calc = 0;

        while(postSqrt*postSqrt <= num1){
            antSqrt = postSqrt;
            postSqrt++;
        }
        calc = ((antSqrt*antSqrt*antSqrt*antSqrt)+(6*antSqrt*antSqrt*num1)+(num1*num1)) / ((4*antSqrt*antSqrt*antSqrt)+(4*antSqrt*num1));
        return calc;
    }
}
