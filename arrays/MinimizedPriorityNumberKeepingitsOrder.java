package arrays;

public class MinimizedPriorityNumberKeepingitsOrder {

    public static void main(String[] args) {
        //maxPriorityInput = 500

        int[] array = {1,4,8,4,99, 88, 99, 345};

        for(int value : minimizePriorityValues(array))
            System.out.print(value + " ");

    }


    static int[] minimizePriorityValues(int[] array){

        int[] counts = new int[500];

        for(int eachPriority : array){
            counts[eachPriority]++;
        }

        int minimum = 1;

        for(int i=0; i< counts.length; i++){
            if(counts[i] >0)
                counts[i] = minimum++;
        }

        for(int i=0; i< array.length; i++){
            array[i] = counts[array[i]];
        }
        return array;

    }


}
