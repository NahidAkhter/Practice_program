package arrays;

public class PrefixStringArray {
    public static void main(String[] args) {

        String[] array = {"flower","flow","flight"};
        System.out.println(commonPrefixInAnArray(array));

    }
//Input: strs = ["flower","flow","flight"]
//Output: "fl"

    public static String commonPrefixInAnArray(String[] strs) {

        if (null == strs || strs.length == 0) return "";

        String result = strs[0];

        int i =1;
        while(i< strs.length){

            while(strs[i].indexOf(result) != 0)
                result = result.substring(0, result.length()-1);

            i++;
        }
        return result;
    }
}
