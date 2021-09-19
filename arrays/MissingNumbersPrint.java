package arrays;

public class MissingNumbersPrint {

    public static void main(String[] args) {

        int array[] = {1, 2, 4, 6, 3, 7, 8,11, 13, 67, 89};
        printMissingNumbersN(array);

       // System.out.println(printMissingNumber(array));

    }

    static void printMissingNumbersN2(int[] arr){

        int diff = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] - i != diff)
            {
                while (diff < arr[i] - i)
                {
                    System.out.print((i + diff) + " ");
                    diff++;
                }
            }
        }
    }

    static void printMissingNumbersN(int[] arr){

        int n = arr.length;
        int temp[]  = new int[arr[n-1]+1];

        for(int i=0; i<n;i++){
            temp[arr[i]] = 1;
        }

        for(int i=arr[0]; i<arr[n-1];i++){
            if(temp[i] == 0){
                System.out.println(i+ " ");
            }
        }

    }

    static int printMissingNumber(int[] array){

        int n = array.length;
        int totalSum = (n * ( n + 1)) / 2 ;

        int sum =0;

        for(int i = 0; i < n - 1; i++)
            sum += array[i];

        return totalSum-sum;

    }
}
