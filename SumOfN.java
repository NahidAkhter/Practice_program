public class SumOfN {

    public static void main(String... args) {

        System.out.println(sumOfN(5, 0));

    }

    private static int sumOfN(int n, int sum){

        if(n==1)
            return sum;
        sum = sum + n;
        return sumOfN(n-1, sum);
    }


}
