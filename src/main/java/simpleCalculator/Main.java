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

    }
}
