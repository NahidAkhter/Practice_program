package Functional.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalsInDetails {

    public static void main(String[] args) {
            Person person = new Person("Nahid", null);

//            String email = person.getEmail()
//                    .map(String::toLowerCase)
//                    .orElse("email not found");
//        System.out.println(email);



        if(person.getEmail().isPresent()){
            String email = person.getEmail().get();
            System.out.println(email.toLowerCase());
        } else {
            System.out.println("email not found");
        }
    }
}

class Person {

    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

  
}

