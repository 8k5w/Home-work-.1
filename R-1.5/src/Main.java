public class Main {
    public static void main(String[] args) {

        System.out.println(sumation(4));

    }
    public static int sumation(int n){
        int sum=0;
        for (int i = n; i >0 ; i--) {
            sum+=i;
        }
        return sum;
    }
}