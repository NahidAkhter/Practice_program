package opentext;

public class MinimumFlip {

    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1,0,0};
        System.out.println(solution(array));
    }

    public static int solution(int[] A) {
       int result =0;

       for (int i=0; i<A.length-1; i++){
          // System.out.println(A[i]);
           if(A[i] == A[i+1]){
               A[i+1] ^= A[i+1];
               result++;
           }
       }

        for (int i=0; i<A.length-1; i++){
            System.out.print(A[i] + ", ");
        }

       return result;
    }
}
