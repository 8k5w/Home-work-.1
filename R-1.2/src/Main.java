public class Main {
    public static void main(String[] args) {
        GameEntry[] A=new GameEntry[5];
        A[0]=new GameEntry();
        A[1]=new GameEntry();
        A[2]=new GameEntry();
        A[3]=new GameEntry();
        A[4]=new GameEntry();
        
        GameEntry[] B=A.clone();
        A[4].setScore(550);

        System.out.println(A[4].getScore());
        System.out.println(B[4].getScore());


    }
}