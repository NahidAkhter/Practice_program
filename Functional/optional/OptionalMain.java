package Functional.optional;

import java.util.Optional;

public class OptionalMain {

    public static void main(String[] args) {
        Optional.ofNullable("nahid.fast@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Can not send email"));



    }
}
