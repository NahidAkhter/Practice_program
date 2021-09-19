package Strings;

public class StringFirstNonRepeatedChar {

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        System.out.println(str.charAt(findFirstNonRepeatingChar(str)));
    }

    static int findFirstNonRepeatingChar(String str){

        int n = str.length();
        int[] array = new int[256];


        for(int i = 0; i<256; i++)
            array[i] = -1;

        for(int i = 0; i<n; i++) {
            if(array[str.charAt(i)] == -1) {
                array[str.charAt(i)] = i;
            }else {
                array[str.charAt(i)] = -2;
            }
        }

        int result = Integer.MAX_VALUE;

        for(int i = 0; i<256; i++) {
            if(array[i] >= 0)
                result = Math.min(result, array[i]);
        }

        if(result ==  Integer.MAX_VALUE) return -1;
        return result;
    }


}
