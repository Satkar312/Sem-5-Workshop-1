import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the radius of the cylinder: ");
            double radius = scanner.nextDouble();
            System.out.println("Enter the height of the cylinder: ");
            double height = scanner.nextDouble();
            double volume = Math.PI * radius * radius * height;
            System.out.println("Volume of the cylinder: " + volume);
        }
    }
}
