import static java.lang.Math.max;

public class WindowSlidingTechniqueMaxSum {


    public static void main(String[] args) {

        int[] arr = {5, -1, 2, 3, 7, -4};

        int maxSum = getMaxSum(arr, 4);
        System.out.println(maxSum);

    }

    private static int getMaxSum(int[] arr, int k){
        int currSum = 0;
        for(int i=0;i< k;i++) currSum += arr[i];

        int maxSum =0;
        for(int i=k; i< arr.length; i++) {
            currSum += arr[i] - arr[i-k];
            maxSum = max(maxSum, currSum);
        }

        return maxSum;

    }
}
