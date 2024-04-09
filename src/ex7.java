public class ex7{
    public static void main(String[] args) {
        int n = 4;
        printSpiral(n);
    }

    public static void printSpiral(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        spiralFill(matrix, 0, 0, n, num);
        printMatrix(matrix);
    }

    public static void spiralFill(int[][] matrix, int startRow, int startCol, int size, int num) {
        if (size <= 0) {
            return;
        }

        for (int i = startCol; i < startCol + size; i++) {
            matrix[startRow][i] = num++;
        }

        for (int i = startRow + 1; i < startRow + size; i++) {
            matrix[i][startCol + size - 1] = num++;
        }

        for (int i = startCol + size - 2; i >= startCol; i--) {
            matrix[startRow + size - 1][i] = num++;
        }

        for (int i = startRow + size - 2; i > startRow; i--) {
            matrix[i][startCol] = num++;
        }

        spiralFill(matrix, startRow + 1, startCol + 1, size - 2, num);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
