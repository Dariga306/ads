import java.util.ArrayList;
import java.util.List;

public class ex8 {
    public static void main(String[] args) {
        int n = 2;
        int k = 3;
        generateSequences(n, k);
    }

    public static void generateSequences(int n, int k) {
        List<Integer> sequence = new ArrayList<>();
        generate(sequence, n, k);
    }

    public static void generate(List<Integer> sequence, int n, int k) {
        if (sequence.size() == n) {
            printSequence(sequence);
            return;
        }

        for (int i = 1; i <= k; i++) {
            sequence.add(i);
            generate(sequence, n, k);
            sequence.remove(sequence.size() - 1);
        }
    }

    public static void printSequence(List<Integer> sequence) {
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
