package CFC.Java.assignment4;

public class Q14_CheckBrackets {
    public static void main(String[] args) {
        String str="[a + {b + (c+d)";
        System.out.println(checkBalancedBrac(str,""));
    }

    private static boolean checkBalancedBrac(String str,String proc) {
        if(str.isEmpty() && proc.isEmpty()){
            return true;
        }
        else if(str.isEmpty() && !proc.isEmpty()){
            return false;
        }
        char ch=str.charAt(0);
        str=str.substring(1);
        if (ch =='{' || ch=='(' || ch=='[')
        {
            return checkBalancedBrac(str,proc+ch);
        }
        if(ch=='}' || ch==')' || ch==']'){
            char brac=proc.charAt(proc.length()-1);
            if(brac == '{' && ch=='}'){
                return checkBalancedBrac(str,proc.substring(0,proc.length()-1));
            }
            if(brac == '(' && ch==')'){
                return checkBalancedBrac(str,proc.substring(0,proc.length()-1));
            }
            if(brac == '[' && ch==']'){
                return checkBalancedBrac(str,proc.substring(0,proc.length()-1));
            }
            return false;
        }
        return checkBalancedBrac(str,proc);

    }
}
