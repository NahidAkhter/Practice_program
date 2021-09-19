package Functional.callbacks;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

//        fullName("Nahid",
//                null,
//                value -> System.out.println("Missing LastName for : " + value));

        fullName2("Nahid",
                null,
                () -> System.out.println("Missing LastName"));


    }

    static void fullName(String firstName, String lastName, Consumer<String> callBack){
        System.out.println(firstName);

        if(null != lastName)
            System.out.println(lastName);
        else
            callBack.accept(firstName);
    }

    static void fullName2(String firstName, String lastName, Runnable callBack){
        System.out.println(firstName);

        if(null != lastName)
            System.out.println(lastName);
        else
            callBack.run();
    }
}
