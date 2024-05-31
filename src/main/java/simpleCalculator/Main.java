package simpleCalculator;

public class Main {
    public static void main(String[] args) {

        Calculate multipleNumbers = new MultipleOperation();
        double calculate = multipleNumbers.calculate(3, 4);
        System.out.println(calculate);

        System.out.println("----------------------");

        multipleNumbers = new SubtractionOperation();
        double calculate1 = multipleNumbers.calculate(3, 4);
        System.out.println(calculate1);

        System.out.println("----------------------");

        multipleNumbers = new DivideOperation();
        double calculate2 = multipleNumbers.calculate(3, 0);
        System.out.println(calculate2);

        System.out.println("----------------------");

        multipleNumbers = new AdditionOperation();
        double calculate3 = multipleNumbers.calculate(3, 1);
        System.out.println(calculate3);

    }
}
