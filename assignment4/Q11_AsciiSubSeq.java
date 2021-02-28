package CFC.Java.assignment4;

public class Q11_AsciiSubSeq {
    public static void main(String[] args) {
        String str="ab";
        subSequenceStr(str,"");
        int count=subSeqCount(str,"",0);
        System.out.println(count);
    }

    private static int subSeqCount(String str, String proc, int count) {
        if (str.isEmpty()) {
            return count+1;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        count=subSeqCount(str, proc,count);
        count=subSeqCount(str, proc + (int) ch,count);
        count=subSeqCount(str, proc + ch,count);
        return count;
    }

    private static void subSequenceStr(String str, String proc) {
        if(str.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch=str.charAt(0);
        str=str.substring(1);
        subSequenceStr(str,proc);
        subSequenceStr(str,proc+(int)ch);
        subSequenceStr(str,proc+ch);

    }
}
