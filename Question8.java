import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter principal: ");
            double p = scanner.nextDouble();
            System.out.println("Enter interest rate: ");
            double r = scanner.nextDouble();
            System.out.println("Enter time: ");
            double t = scanner.nextDouble();
            double interest = (p * r * t) / 100;
            System.out.println("Simple Interest: " + interest);
        }
    }
}
