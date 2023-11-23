import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the quantity: ");
            int q = scanner.nextInt();
            System.out.println("Enter the price/item: ");
            double p = scanner.nextDouble();
            double totalCost = q * p;
            System.out.println("Total cost: " + totalCost);
        }
    }
}
