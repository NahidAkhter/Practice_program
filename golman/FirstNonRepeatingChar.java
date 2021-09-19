package golman;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        //System.out.println(findNonRepeatChar("GeeksForGeeks"));
//        findFirstNonRepeat("geeksforgeeks");

        String str = "GeeksAForGeeks";
        int index =  firstNonRepeating(str);
        System.out.println(str.charAt(index));

    }

    private static char findNonRepeatChar(String str){
        for(int i =0 ; i<str.length(); i++){
            int count =0;
           for(int j=0; j<str.length(); j++){

               if(str.charAt(i) == str.charAt(j))
                   count ++;
           }
           if(count == 1) return str.charAt(i);
        }
        return 'N';
    }

    public static int firstNonRepeating(String str) {
        int n = 256;
        int[] fi = new int [n]; // array to store First Index

        // initializing all elements to -1
        for(int i = 0; i<n; i++)
            fi[i] = -1;

        // sets all repeating characters to -2 and non-repeating characters
        // contain the index where they occur
        for(int i = 0; i<str.length(); i++) {
            if(fi[str.charAt(i)] == -1) {
                fi[str.charAt(i)] = i;
            }else {
                fi[str.charAt(i)] = -2;
            }
        }

        int res =  Integer.MAX_VALUE;

        for(int i = 0; i<n; i++) {

            // If this character is not -1 or -2 then it
            // means that this character occurred only once
            // so find the min index of all characters that
            // occur only once, that's our first index
            if(fi[i] >= 0)
                res = Math.min(res, fi[i]);
        }

        // if res remains  Integer.MAX_VALUE, it means there are no
        // characters that repeat only once or the string is empty
        if(res ==  Integer.MAX_VALUE) return -1;
        else return res;
    }

//    private static int findFirstNonRepeat(String str) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//
//        for(int i=0; i<str.length(); i++){
//
//            if(hashMap.containsKey(str.charAt(i)))
//                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
//            else
//                hashMap.put(str.charAt(i), 1);
//        }
//
//        int result = Integer.MAX_VALUE;
//        for(Map.Entry<Character, Integer> entrySet : hashMap.entrySet()){
//            int count = entrySet.getValue();
//            int index = entrySet.getKey();
//
//            if(count == 1 && index < result) result = index;
//        }
//        return result;
//
//    }

}
