package simpleCalculator;

public class AdditionOperation implements Calculate{
    @Override
    public double calculate(double number1, double number2) {
        return number1 + number2;
    }
}
