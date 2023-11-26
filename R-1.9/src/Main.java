public class Main {
    public static void main(String[] args) {
        String d="Let's try, Mike!";
        System.out.println(d);
        System.out.println(remove_punctuation(d));

    }
    public static String remove_punctuation(String s){
        StringBuilder s_builder= new StringBuilder(s);
        for (int i = 0; i <s_builder.length() ; i++) {
            if(!Character.isLetterOrDigit(s_builder.charAt(i))&&!Character.isWhitespace(s_builder.charAt(i))){
                s_builder.deleteCharAt(i);
                i--;
            }

        }
        return  s_builder.toString();
    }
}