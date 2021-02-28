package CFC.Java.assignment4;

public class Q6_InverseNumber {
    public static void main(String[] args) {
        int number=42135;
        number=inverseNumber(number,0,1);
        System.out.println(number);


    }

    private static int inverseNumber(int number, int result, int place) {
        if(number==0) {
            return result;
        }
        int remainder=number%10;
        result=inverseNumber(number/10,result,place+1);
        return (int) (result+(place*Math.pow(10,(remainder-1))));

    }


}

