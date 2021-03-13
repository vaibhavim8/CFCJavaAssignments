package CFC.Java.assignment5;

import java.util.Locale;

public class Q5_CodesInStr {
    public static void main(String[] args) {
        String str="1123";
        printCodes(str,"");
    }

    private static void printCodes(String str, String emp) {
        if(str.length()==0){
            System.out.println(emp);
            return;
        }
        for (int i = 0; i < str.length() ; i++) {
            printCodes(str.substring(1),emp+(char)(Integer.parseInt(str.substring(0,1))-1+'a'));
            if(str.length()>1){
                printCodes(str.substring(2), emp + (char) (Integer.parseInt(str.substring(0, 2)) - 1 + 'a'));
                return;
            }

        }

    }
}
