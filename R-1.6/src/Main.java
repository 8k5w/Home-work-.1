public class Main {
    public static void main(String[] args) {
        System.out.println(sumation(2));
    }
    public static int sumation(int n){
        int sum=0;
        for (int i = n; i >0 ; i--) {
            if(i%2==1){
                sum+=i;
            }
        }
        return sum;
    }
}