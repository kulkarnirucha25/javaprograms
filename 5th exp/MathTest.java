import MathOperations.MathFunctions;

public class MathTest {
    public static void main(String[] args) {

        double number = 5.7;

        System.out.println("Original Number: " + number);
        System.out.println("Floor: " + MathFunctions.floorValue(number));
        System.out.println("Ceil: " + MathFunctions.ceilValue(number));
        System.out.println("Round: " + MathFunctions.roundValue(number));
    }
}