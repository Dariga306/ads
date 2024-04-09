public class ex4 {
    public static int SumOfPowers(int b,int n){
        if(n==0){
            return 1;
        }
        else if(b==0){
            return 0;
        }
        else{
            return (int) Math.pow(b,n)+SumOfPowers(b,n-1);
        }
    }
    public static void main(String[] args){
        int b=4;
        int n=2;
        int result=SumOfPowers(b,n);
        System.out.println(result);
    }
}
