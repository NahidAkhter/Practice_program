package arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {

        int[] array = {5,4,-1,7,8};

        System.out.println(maxSumSubArray(array));

    }

    public static int maxSumSubArray(int[] nums){

        int max = Integer.MIN_VALUE, sum =0;

        for(int i=0 ; i< nums.length; i++) {
            if(sum < 0)
                sum = nums[i];
            else
                sum += nums[i];

            if(sum > max)
                max = sum;
        }

        return max;
    }
}
