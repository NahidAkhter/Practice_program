package arrays;

public class SortAnArray {


    public static void main(String[] args) {
        int[] nums = {5,2,3,1,9};
       sortArray(nums, 0, nums.length-1);

       for(int value : nums){
           System.out.print(value + ", ");
       }
    }


    public static void sortArray(int[] nums, int begin, int end) {
        int mid;
        if( begin < end){
             mid = ((end-1) + begin)/2;

            sortArray(nums, begin, mid);
            sortArray(nums, mid+1, end);
            merge(nums, begin, mid, end);
        }
    }

    public static void merge(int[] nums, int begin, int mid, int end){

        int[] rightArray = new int[end-mid];
        int[] leftArray = new int[mid-begin + 1];

        for(int i = 0; i< rightArray.length; i++)
            rightArray[i] = nums[mid+1+i];

        for(int i = 0; i< leftArray.length; i++)
            leftArray[i] = nums[begin+i];

        int l=0, r=0, resultSize = begin;

        while(l < leftArray.length && r < rightArray.length){

            if(leftArray[l] <= rightArray[r]){
                nums[resultSize] = leftArray[l];
                l++;
            }  else {
                nums[resultSize] = rightArray[r];
                r++;
            }
            resultSize++;
        }

        while(l < leftArray.length){
            nums[resultSize] = leftArray[l];
            resultSize++;
            l++;
        }

        while(r < rightArray.length){
            nums[resultSize] = rightArray[r];
            resultSize++;
            r++;
        }
    }


}
