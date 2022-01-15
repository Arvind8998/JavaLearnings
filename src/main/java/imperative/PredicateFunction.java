package imperative;

import java.util.function.Predicate;

public class PredicateFunction {
    public static void main(String[] args) {
        System.out.println(isValidPhoneNo.and(doesPhoneNumContains0).test("9112121212"));
        System.out.println(isValidPhoneNo.or(doesPhoneNumContains0).test("9112121212"));
    }
    static Predicate<String> isValidPhoneNo = (number) -> number.startsWith("91")
            && number.length() >=10;

    static Predicate<String> doesPhoneNumContains0 = (number) -> number.contains("0");
}
