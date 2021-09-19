package leetcode.contest;

public class Main {

    public static void main(String[] args) {

        System.out.println(isThree(89));

    }

    public static boolean isThree(int n) {

        if(n==1 || n==2 || n==3 || n==5) return false;

        int count = 0;
        for(int i=1; i< 10000; i++){

            if(n % i == 0) {
                count++;
                System.out.print( i + ", ");
            }

        }

        if(count == 3)
            return true;

        return false;

    }

}
