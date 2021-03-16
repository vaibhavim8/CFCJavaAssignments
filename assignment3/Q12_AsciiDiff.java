package CFC.Java.assignment3;

public class Q12_AsciiDiff {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("acb");
        getAsciiDiff(str);
        }

    private static void getAsciiDiff(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                char first=str.charAt(i);
                if((str.length()-i)>1){
                    char second=str.charAt(i+1);
                    str.replace(i,i+1,first+(Integer.toString(second-first)));
                }
            }
        }
        System.out.println(str);
    }
}
