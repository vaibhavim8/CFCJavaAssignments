package CFC.Java.assignment3;

public class Q11_UpperLower {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcDEWfg");
        getToggledChar(str);
    }

    private static void getToggledChar(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
            else {
                str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println(str);
    }
}