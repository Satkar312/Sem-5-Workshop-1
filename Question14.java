import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the amount in U.S. dollars: ");
            double a = scanner.nextDouble();
            System.out.println("Enter the exchange rate: ");
            double b = scanner.nextDouble();
            double convert = a * b;
            System.out.println("Converted amount: " + convert);
        }
    }
}
