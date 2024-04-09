import java.util.Scanner;

public class ex6 {
    static void reverseSequence(int n, Scanner scanner) {
        if (n > 0) {
            String str = scanner.nextLine();
            reverseSequence(n - 1, scanner);
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        reverseSequence(n, scanner);
        scanner.close();
    }
}
