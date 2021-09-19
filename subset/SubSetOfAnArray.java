package subset;

public class SubSetOfAnArray {

    public static void main(String[] args) {
        int[] array = {1,3,2,1};
        for(int value : concatenate(array))
            System.out.println(value + ",");
    }

    private static int[] concatenate(int[] nums){

        int[] ans = new int[2* nums.length];
        int n = 2, j =0;
        while( n > 0){
            for(int i=0; i< nums.length; i++){

                ans[j] = nums[i];
                j++;

            }
            n--;
        }


        return ans;
    }
}
