import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter temperature in Celsius: ");
            double cel = scanner.nextDouble();
            double fahr = cel * 9/5 + 32;
            System.out.println("Temperature in Fahrenheit: " + fahr);
        }
    }
}
