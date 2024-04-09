import java.sql.SQLOutput;
import java.util.zip.CheckedOutputStream;

public class exercise2 {
    public static int SumOfArrayElements(int []arr,int n){
        if(n==0){
            return 0;
        }
        else{
            return arr[n-1]+SumOfArrayElements(arr, n-1);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int n=5;
        int sum=SumOfArrayElements(arr,n);
        System.out.println(sum);
    }
}