package search;

public class Main {
    public static void main(String[] args) {
        System.out.println(findBinaryProduct(3));
    }

    static int findBinaryProduct(int p){
            int limit = (int) Math.pow(2, p);
            int[] result = new int[limit];
            int resultValue = 1;
            for(int i=0; i<limit;i++){
                result[i] = findBinary(i);
                resultValue *= result[i];
            }

            return resultValue;
    }

    static int findBinary(int n){

        int i=0, result=0;
        int nums[] = new int[n];
        while(n > 0){
            nums[i] = n % 2;
            n = n/2;
            i++;
        }

        String strNumber = "1";
        for(int j= i-1; j>=0;j--){
            strNumber += nums[j];
            System.out.print(strNumber);

        }
        System.out.println(strNumber);
        int value = Integer.parseInt(strNumber);

        return convertIntoDecimal(value);

    }

    private static int convertIntoDecimal(int n) {
        int result =0;
        int mul = 1;
        while(n!=0){
            int digit = n % 10;
            result += digit * mul;
            n = n /10;
            mul *= 2;
        }
        System.out.println(result);
        return result;
    }

}
