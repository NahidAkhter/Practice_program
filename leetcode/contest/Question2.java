package leetcode.contest;

import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {

        int[] array = {1,2,3};
        System.out.println(noOfWeeks(array));

    }

    public static long noOfWeeks(int[] milestones){

        int result=0;
        Arrays.stream(milestones).sorted();
        int n = milestones.length;

            while(milestones[n-1] >= milestones[n-2] && n>=0){
                result++;
                milestones[n] = milestones[n]--;
                milestones[n-1] = milestones[n-1]--;

                if(milestones[n-2] >= milestones[n-1])
                    n--;
            }


        return result;
    }
}
