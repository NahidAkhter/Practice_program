package leetcode.arrays;

public class ArraysStringPrefix {

    public static void main(String[] args) {

        String[] sample = {"", "flight","flower", "flow"};
        System.out.println(longestCommonPrefix(sample));

    }

    private static String longestCommonPrefix(String[] strs) {

        String result = "";

        for (int i = 0; i < strs.length - 1; i++) {

            int strsStringLength = strs[i].length() - 1;
            int startLength = strs[i+1].length();
            for (int j = 0; (j < strsStringLength) && startLength > 0; j++) {
                if(strs[i].charAt(j) == strs[i+1].charAt(j)){
                    result = result + strs[i+1].charAt(j);
                }
                startLength--;
            }
        }
        return result;
    }

}
