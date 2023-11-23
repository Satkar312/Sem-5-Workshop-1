import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of one side: ");
            double side = scanner.nextDouble();
            double area = side * side;
            System.out.println("Area of the square: " + area);
        }
    }
}
