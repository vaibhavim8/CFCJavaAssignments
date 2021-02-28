package CFC.Java.assignment4;

public class Q13_RemoveDuplicate {
    public static void main(String[] args) {
        String str="heeeello";
        System.out.println(removeDuplicate(str,""));
    }

    private static String removeDuplicate(String str, String proc) {
        if(str.isEmpty()){
            return proc;
        }
        char first=str.charAt(0);
        if(str.length()>1){
            char second=str.charAt(1);
            if(first==second){
                return removeDuplicate(str.substring(1),proc);
            }
        }
        return removeDuplicate(str.substring(1),proc+first);
    }
}
