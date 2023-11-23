import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter value of sides a,b and c");
            System.out.println("a");
            double a = scanner.nextDouble();
            System.out.println("b");
            double b = scanner.nextDouble();
            System.out.println("c");
            double c = scanner.nextDouble();
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of triangle: " + area);
        }
    }
}
