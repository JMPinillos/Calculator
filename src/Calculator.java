public class Calculator {

    // Método para calcular la suma de dos números de precisión double.

    public double add(double num1, double num2){
        return num1 + num2;
    }

    // Método para calcular la resta de dos números de precisión double.

    public float subtract(float num1, float num2){
        return num1-num2;
    }

    // Método para calcular la multiplcación de dos números de precisión double.

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    // Método para calcular la division de dos números de precisión double.

    public double divide(double num1, double num2){
        return num1 / num2;
    }

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
