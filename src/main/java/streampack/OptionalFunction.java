package streampack;

import java.util.Optional;

public class OptionalFunction {
    public static void main(String[] args) {

        Optional.ofNullable("My Email")
                .ifPresentOrElse(val -> System.out.println("Sending msg " + val),
                        ()-> System.out.println("Cannot print msg"));

    }
}
