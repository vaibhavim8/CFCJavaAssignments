package CFC.Java.assignment1;

import java.util.Scanner;

public class NumberQues1To6 {

    public static void main(String[] args) {
        //int num=9735;
        //int rev=reverseInt(num);
        //System.out.println(rev);
        Scanner s=new Scanner(System.in);
        int credits=s.nextInt();
        checkBadge(credits);
        int amt=s.nextInt();
        double rate=s.nextDouble();
        int time=s.nextInt();
        calculateInterest(amt,rate,time);

    }

    private static void calculateInterest(int amt, double rate, int time) {
        double interest=(amt*rate*time)/100;
        System.out.println(interest);
    }

    private static void checkBadge(int credits) {
        if(credits<4500){
            System.out.println("Rising Star");
        }else if(credits>=4500 && credits<6000){
            System.out.println("Mega Leader");
        }else if(credits>=6000 && credits<7500){
            System.out.println("Gega Leader");
        }else {
            System.out.println("Tera Leader");
        }

    }

    private static int reverseInt(int num) {
        int rev=0;
        while(num>0){
            int remainder=num%10;
            num=num/10;
            rev=rev*10+remainder;

        }
        return rev;
    }
}
