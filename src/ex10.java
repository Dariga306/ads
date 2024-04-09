public class ex10 {
    public static void main(String[] args) {
        int[] testNumbers = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32};

        for (int num : testNumbers) {
            System.out.print(num + " is ");
            if (isPowerOfTwo(num)) {
                System.out.println("a power of two");
            } else {
                System.out.println("not a power of two");
            }
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
