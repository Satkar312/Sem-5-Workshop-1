import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the length: ");
            double l = scanner.nextDouble();
            System.out.println("Enter the width: ");
            double w = scanner.nextDouble();
            double periofRect = 2 * (l + w);
            System.out.println("Perimeter of the rectangle: " + periofRect);
        }
    }
}
