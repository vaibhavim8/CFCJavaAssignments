package CFC.Java.assignment3;

public class Q10_ReplaceAscii {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abcz");
        replaceAscii(str);
    }

    private static void replaceAscii(StringBuilder str) {

        for (int i = 1; i <= str.length() ; i++) {
            if(i%2==0){
                char ch=(char) ((int)str.charAt(i-1)-1);
                str.setCharAt(i-1,ch);
            }
            else{
                char ch=(char) ((int)str.charAt(i-1)+1);
                str.setCharAt(i-1,ch);
            }
        }
        System.out.println(str);
    }
}
