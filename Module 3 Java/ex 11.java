// Factorial Calculator
import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a non-negative integer: ");
            int number = sc.nextInt();

            long factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Display result
            System.out.println("Factorial of " + number + " = " + factorial);
        }
    }
}