package CFC.Java.assignment4;

public class Q12_DuplicateStr {
    public static void main(String[] args) {
        String unproc="hello";
        System.out.println(replaceDuplicate(unproc,""));
    }

    private static String replaceDuplicate(String unproc, String proc) {
        if(unproc.isEmpty()){
            return proc;
        }
        char first=unproc.charAt(0);
        if(unproc.length()>1){
            char second=unproc.charAt(1);
            if(first==second){
                return replaceDuplicate(unproc.substring(1),proc+first+"-");
            }

        }
        return replaceDuplicate(unproc.substring(1),proc+first);
    }
}
