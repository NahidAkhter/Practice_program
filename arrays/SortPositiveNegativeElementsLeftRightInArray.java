package arrays;

public class SortPositiveNegativeElementsLeftRightInArray {

    public static void main(String[] args) {

        //Questions: arrange -ve at left and +ve at right
        int[] array = {1,-1,4,-2,9,8,-7};

        arrangeArray(array);

        for(int value : array)
            System.out.print(value + " ");


    }

    static void arrangeArray(int[] array){
        int key, j, n=array.length;

        for(int i=0; i<n;i++){
            key = array[i];
            if(key > 0)  continue;
            j= i-1;

            while(j>=0 && array[j] > 0){
                array[j+1] = array[j]; j = j-1;
            }
            array[j+1] = key;
        }
    }




}
