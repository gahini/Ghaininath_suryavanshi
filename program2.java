
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = scanner.nextInt();

            for (int i = 0; i < a; i++) {
                System.out.print((2 * i + 1) + (i < a - 1 ? ", " : ""));
            }
        }
    }
}
