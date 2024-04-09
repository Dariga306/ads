public class ex9 {

    public static void main(String[] args) {
        String str = "bom";
        permute(str.toCharArray(), 0, str.length() - 1);
    }

    public static void permute(char[] arr, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            System.out.println(String.valueOf(arr));
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                swap(arr, startIndex, i);
                permute(arr, startIndex + 1, endIndex);
                swap(arr, startIndex, i);
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
