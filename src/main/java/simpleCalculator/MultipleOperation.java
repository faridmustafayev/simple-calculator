package simpleCalculator;

public class MultipleOperation implements Calculate{
    @Override
    public double calculate(double number1, double number2) {
        return number2 * number1;
    }
}
