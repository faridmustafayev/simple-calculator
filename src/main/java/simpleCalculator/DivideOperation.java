package simpleCalculator;

public class DivideOperation implements Calculate{
    @Override
    public double calculate(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("no division by zero");
        }else {
            return number1 / number2;
        }
    }

}
