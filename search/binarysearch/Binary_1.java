package search.binarysearch;

public class Binary_1 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9, 10, 11};

        System.out.println("Search sorted array : " + recursiveBinarySearch(array, 33, 0, array.length-1));


    }

    static int searchIterative(int[] array, int item) {

        for(int i=0; i<array.length;i++){
            if(item == array[i])
                return i;
        }
        return -1;
    }

    static int searchIterativeForSortedArray(int[] array, int item) {

        if (array[0] > item) return -1;

        int low = 0, mid =0;
        int high = array.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (array[mid] == item)
                return mid;
              else if (array[mid] > item)
                    high = mid - 1;
                 else
                    low = mid + 1;
        }

        return mid;
    }


    static int recursiveBinarySearch(int[] array, int item, int low, int high){

        int mid = (high+low)/2;

        if(low > high) return -1;

        if(array[mid] == item) return mid;

        if(array[mid] > item)
            return recursiveBinarySearch(array, item, low, mid-1);
        else
            return recursiveBinarySearch(array, item, mid +1, high);
    }

}
