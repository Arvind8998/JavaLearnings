package streampack;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static  streampack.StreamsFunctions.Gender.*;

public class StreamsFunctions {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Tony", MALE),
                new Person("Rony", MALE),
                new Person("Alice", FEMALE),
                new Person("Nicole", FEMALE),
                new Person("Monte", MALE)
        );

//        people.stream().map(person -> person.gender)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);
    }

    static  class Person{
        private final Gender gender;
        private String name;


        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public  String toString(){
            return  this.gender + " Name is " + this.name;
        }
    }

    enum Gender{
        FEMALE, MALE
    }
}
