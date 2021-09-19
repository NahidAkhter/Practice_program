public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigitsWithOneParam(999919));
    }

    private static int sumOfDigits(int n, int sum){

        if(n==0)
            return sum;

        sum = sum + n % 10;

        n = n /10;
        return sumOfDigits(n, sum);


    }

    private static int sumOfDigitsWithOneParam(int n){

        if(n == 1)
            return 1;

        if (n == 0)
            return 0;


        return sumOfDigitsWithOneParam(n / 10) + n % 10;



    }
}
