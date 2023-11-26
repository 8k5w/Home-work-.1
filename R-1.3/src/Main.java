public class Main {
    public static void main(String[] args) {

        long n ,m;
        n=6;
        m=3;
        System.out.println(isMultiple(n,m));
    }
    public static boolean isMultiple(long n,long m){

        if(n%m==0){
            return true;
        }else{
            return false ;
        }

    }
}