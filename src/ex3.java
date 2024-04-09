public class ex3 {
    public static int SumOfPositives(int n){
        if(n==1){
            return 1;
        }
        else {
            return n+SumOfPositives(n-1);
        }
    }
    public static void main(String[] args){
        int n =4;
        int result=SumOfPositives(n);
        System.out.println(result);
    }
}
