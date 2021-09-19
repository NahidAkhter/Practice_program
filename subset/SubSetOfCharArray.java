package subset;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetOfCharArray {

    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};

        int[] numberSet = {1,0,1};
        printSubsetForInteger(numberSet);
        //printSubSets(set);
        //printPowerSet(set);
       // printSubSets(set);
    }

    static void printPowerSet(char[] set) {

        long powerSet = (long) Math.pow(2, set.length);
        for (int i = 0; i < powerSet; i++) {
            for (int j = 0; j < set.length; j++) {
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j]);
            }
            System.out.println();
        }
    }

    static void printSubSets(char[] charSet) {

        int limit = (int) Math.pow(2, charSet.length);
        for (int i = 0; i < limit; i++) {
            String result = "";
            int temp = i;
            for (int j = charSet.length - 1; j >= 0; j--) {

                int r = temp % 2;
                temp = temp / 2;

                if (r == 0)
                    result = "-\t" + result;
                else
                    result = charSet[j] + "\t" + result;

            }
            System.out.println(result);
        }

    }

    static void printSubsetForInteger(int[] array) {

        int limit = (int) Math.pow(2, array.length);
        System.out.println("=================" + limit + "================");
        int count = 0;

        for (int i = 0; i < limit; i++) {
            ArrayList<Integer> result = new ArrayList<>();

            int temp = i;
            for (int j = array.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r != 0) {
                    result.add(array[j]);
                }
            }

            if(result.size() >= 2)
                count ++;

            System.out.println(result );

        }

        System.out.println("Value of Count : " + count);
    }
}

