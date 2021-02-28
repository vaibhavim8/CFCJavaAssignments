package CFC.Java.assignment4;

public class Q9_CheckStr {
    public static void main(String[] args) {
        String str="aabbabb";
        System.out.println(checkStr(str,str));

    }

    private static boolean checkStr(String unproc,String original) {

        if(unproc.isEmpty()){
            return true;
        }
        char ch=unproc.charAt(0);
        unproc=unproc.substring(1);
        if(original.charAt(0)!='a'){
            return false;
        }
        if(ch==' '){
            return true;
        }
        if(ch=='a'){
            return checkStr(unproc,original);
        }

        if(ch=='b' && !unproc.isEmpty()){
            if(unproc.charAt(0)=='b')
                return checkStr(unproc.substring(1),original);
        }
        return false;

    }

}
