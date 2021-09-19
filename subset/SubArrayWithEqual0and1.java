package subset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArrayWithEqual0and1 {

    public static void main(String[] args) {

        int[] array = {0,1,1,0,1,1,0};

        System.out.println(findMaxLength(array));

    }

    static int findMaxLength(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
}


    static void getResultFor(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        int[] prefix = new int[nums.length + 1];
        prefix[0] = 0;
        for(int i = 1; i < prefix.length; i++){
            if(nums[i-1] == 1){
                prefix[i] = prefix[i - 1] + 1;
            }else{
                prefix[i] = prefix[i - 1] - 1;
            }
        }

        for(int value : prefix)
            System.out.print(value + " ");

        int res = 0;
        for(int i = 0; i < prefix.length; i++){
            if(prefix[i] == 0){
                res = Math.max(res, i);
                System.out.println("res " + res);
            }else if(map.containsKey(prefix[i])){
                System.out.println(":: "+ (i- map.get(prefix[i])));
                res = Math.max(res, i - map.get(prefix[i]));
                System.out.println("res1 " + res);
            }else{
                System.out.println("prefix[i] " + prefix[i] + " : " + i);
                map.put(prefix[i], i);
            }
        }

    }
}
