package imperative;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Tony", MALE),
                new Person("Rony", MALE),
                new Person("Alice", FEMALE),
                new Person("Nicole", FEMALE),
                new Person("Monte", MALE)
        );


        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate )
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

