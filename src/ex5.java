import java.util.Scanner;

public class ex5 {
    public static void Reverse(int n) {
        Scanner scanner = new Scanner(System.in);
        if (n > 0) {
            int num = scanner.nextInt();
            Reverse(n - 1);
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the sequence: ");
        int n = scanner.nextInt();
        System.out.println("Enter the sequence:");
        Reverse(n);
    }
}
