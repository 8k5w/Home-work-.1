public class Main {
    public static void main(String[] args) {
        int i=7;
        System.out.println(isEven(i));
    }

    public static boolean isEven(int i) {
        if((1 & i)==1){
            return false;
        }else{
            return true;
        }

    }
}