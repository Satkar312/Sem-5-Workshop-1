import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the radius: ");
            int r = scanner.nextInt();
            double a = Math.PI * r * r;
            System.out.println("Area of the circle: " + a);
        }
    }
}
