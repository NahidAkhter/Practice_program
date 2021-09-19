package arrays;

import java.util.HashMap;

public class FindSetEqualsTOGivenSum {

    public static void main(String[] args) {

        int[] array = {1, 5, 7, -1, 5 };
        System.out.println(printPairSetEqualsTOSum(array, 6));

    }

    static int printPairSetEqualsTOSum(int[] array, int givenSum) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<array.length;i++){
            if(map.containsKey(array[i]))
                map.put(array[i], map.get(array[i]) + 1);
            else
                map.put(array[i], 1);
        }
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (map.get(givenSum - array[i]) != null)
                counter += map.get(givenSum - array[i]);

            if (givenSum - array[i] == array[i])
                counter--;
        }

        return counter /2;

    }
}
