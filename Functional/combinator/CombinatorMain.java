package Functional.combinator;

import com.sun.net.httpserver.Authenticator;

import java.time.LocalDate;

import static Functional.combinator.CustomerRegistrationValidator.*;

public class CombinatorMain {

    public static void main(String[] args) {
        Customer customer = new Customer(
          "Alex",
          "alex@gmail.com",
          "+91987654321",
                LocalDate.of(2004, 07,10)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        //Using Combinator Pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if(ValidationResult.SUCCESS != result)
            throw new IllegalStateException(result.name());

    }
}
