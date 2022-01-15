package imperative;

import java.util.function.Function;

public class Declarative {
    public static void main(String[] args) {
        int counter = 0;

        Function<Integer, Integer> incrementByone = number -> ++number;

        Function<Integer, Integer> multipleBy10 = number -> number*10;

        Function<Integer, Integer> incrementBy1AndMultiplyBy10 = incrementByone.andThen(multipleBy10);



        System.out.println(incrementBy1AndMultiplyBy10.apply(counter));

    }
}
