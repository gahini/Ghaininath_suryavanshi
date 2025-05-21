
import java.util.Scanner;

class Calculator {
    private final double a;
    private final double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "add" -> {
                return a + b;
            }
            case "subtract" -> {
                return a - b;
            }
            case "multiply" -> {
                return a * b;
            }
            case "divide" -> {
                if (b != 0) return a / b;
                else throw new ArithmeticException("Division by zero");
            }
            default -> throw new IllegalArgumentException("Invalid operation");
        }
    }
}

public class program1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number (a): ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number (b): ");
            double b = scanner.nextDouble();
            System.out.print("Enter operation (add/subtract/multiply/divide): ");
            String operation = scanner.next();

            Calculator calc = new Calculator(a, b);
            try {
                System.out.println("Result: " + calc.calculate(operation));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
