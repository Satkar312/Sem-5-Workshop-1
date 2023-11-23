import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int b = scanner.nextInt();
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
        }
    }
}
