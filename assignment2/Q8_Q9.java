package CFC.Java.assignment2;

import java.util.Scanner;

public class Q8_Q9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        //System.out.println(checkMultiple(arr));
        System.out.println(checkPrime(arr));
    }

    private static int checkPrime(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j*j <=arr[i] ; j++) {
                if(arr[i]%j==0){
                    count++;
                    break;
                }

            }


        }
        return arr.length-count;
    }

    private static int checkMultiple(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%5==0){
                count++;
            }
        }
        return count;
    }
}
