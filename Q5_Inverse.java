package CFC.Java.assignment2;

public class Q5_Inverse {
        public static void main(String[] args) {
            int number=42135;
            inverseNumber(number);


        }

        private static void inverseNumber(int number) {
            int res=0;
            int place=1;
            while (number>0){
                int remainder=number%10;
                number=number/10;
                res= (int) (res+place*Math.pow(10,(remainder-1)));
                place=place+1;
            }
            System.out.println(res);


        }
    }


