package Functional.Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Main().upperCaseNameAndAge.apply("Nahid", 28));
    }

    BiFunction<String, Integer, String> upperCaseNameAndAge = (name, age) ->
    {
        if(name.isBlank()) throw new IllegalStateException("Name is blank");
        return name.toUpperCase() + " : age " +age;
    };
}
