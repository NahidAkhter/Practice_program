package Functional.func;

public class Main {

    @FunctionalInterface
    public interface MyInterface {
        int myFunction(int n);
    }

    public static void main(String[] args) {

        System.out.println("==Main==");
        MyInterface myInterface = (n) -> {
            int result = 1;
            for(int j = 1; j<=n ; j++){
                result *=j;
            }
            return result;
        };

       int value = myInterface.myFunction(5);
        System.out.println(value);

    }
}

class IntOperations {

    static int factorial(int n){
        int result = 1;
        for(int i = 1; i<=n ; i++){
            result *=i;
        }
        return result;
    }
}
