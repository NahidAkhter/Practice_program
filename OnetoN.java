public class OnetoN {

    public static void main(String[] args) {
        printOneToN(10);
    }

    private static void printOneToN(int n){

        if(n ==0)
            return;

        //System.out.println(n);

        printOneToN(n-1);

        System.out.println(n);
    }


}
