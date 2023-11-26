public class Main {
    public static void main(String[] args) {
        System.out.println(sumationOfSquares(2));
    }
    public static int sumationOfSquares(int n){
        int sum=0;
        for (int i = n; i >0 ; i--) {
            sum+=(i*i);
        }
        return sum;
    }
}