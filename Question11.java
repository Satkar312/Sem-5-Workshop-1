import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter distance in miles: ");
            double m = scanner.nextDouble();
            double km = m * 1.60934;
            System.out.println("Distance in kilometers: " + km);
        }
    }
}
