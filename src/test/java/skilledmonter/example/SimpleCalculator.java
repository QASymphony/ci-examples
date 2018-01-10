package skilledmonter.example;

/**
 * Created by duongnapham on 1/10/18.
 */
public class SimpleCalculator implements CalculatorService {

    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}
