
import java.util.Scanner;

public class calculator {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double result;  
            switch(operator) {
                case '+' -> result = a + b;
                case '-' -> result = a - b;
                case '*' -> result = a * b;
                case '/' -> {
                    if (b != 0) {
                        result = (double) a / b;
                    } else {
                        System.out.println("Error: Division by zero");
                        return;
                    }
                }
                default -> {
                    System.out.println("Error: Invalid operator");
                    return;
                }
            }
            System.out.println("Result: " + result);
        }
} 
    
}
