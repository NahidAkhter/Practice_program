package primitiveSorting;

import java.util.ArrayList;

public class removeDuplicates {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer> numbers = new ArrayList<>();
        int j=0;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
                numbers.add(nums[i]);
            }

        }

        System.out.println(j+1);
        System.out.println(numbers);
    }
}
