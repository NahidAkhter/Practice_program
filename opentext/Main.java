package opentext;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        int[] array = {3, 8,2,3,3,2};
        System.out.println(main.solution(array));

    }

    public int solution(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = A.length;
        for(int i = 0; i< n; i++){

            if(!map.containsKey(A[i]))
                map.put(A[i], 0);
            map.put(A[i], map.get(A[i]) + 1);
        }

        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer, Integer> entrySet : map.entrySet()){

            if(entrySet.getValue() == entrySet.getKey() && max < entrySet.getValue())
                max = entrySet.getValue();
        }

        if(max == Integer.MIN_VALUE)
            return 0;

        return max;



    }
}
