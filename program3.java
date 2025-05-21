
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = scanner.nextInt();

            for (int i = 0; i < a; i++) {
                if (i % 2 == 0) {
                    System.out.print((2 * i + 1) + (i < a - 2 ? ", " : ""));
                }
            }
        }
    }
}
