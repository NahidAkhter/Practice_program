package leetcode.contest254;

import java.util.HashMap;

public class LeetCodeMain {

    public static void main(String[] args) {

        System.out.println(myPower(2.00000,-2147483648));
        System.out.println(myPow(2.00000,-2147483648));


    }

    static double myPower(double x , int n){

        if(n==0) return 1;

        if(n<0){

            n = (n == Integer.MIN_VALUE) ? Integer.MAX_VALUE - 1 : -n;
            return  ( 1 /myPower(x, n));
        }


        if(n%2==0){
            double r = myPower(x, n/2);
            return r*r;
        } else{
            return x * myPower(x, n-1);
        }

    }



    public static double myPow(double x, int n) {

        if (n < 0) {
            n = (n == Integer.MIN_VALUE) ? Integer.MAX_VALUE - 1 : -n;
            x = 1 / x;
        }
        return helper(x, n);
    }

    private static double helper(double x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 1) return x * helper(x, n - 1);
        return helper(x * x, n / 2);
    }

}
