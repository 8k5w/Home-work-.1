public class Main {
    public static void main(String[] args) {

        char[] vowels={'a','i','e','o','u'};
        String sentence="Hello my name is safa";
        System.out.println(counts_vowels(vowels,sentence));
    }
    public static int counts_vowels(char[] vowels,String sentence){
        int count=0;
        for (int i = 0; i <sentence.length() ; i++) {
            for (char letter:vowels) {
                if(letter==sentence.charAt(i)){
                    count+=1;
                }
            }
        }
        return count;
    }


}