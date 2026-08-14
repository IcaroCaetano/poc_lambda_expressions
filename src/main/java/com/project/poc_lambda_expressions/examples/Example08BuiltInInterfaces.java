package com.project.poc_lambda_expressions.examples;

import com.project.poc_lambda_expressions.model.Person;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example08BuiltInInterfaces {

    public static void main(String[] args) {

        predicateExample();

        functionExample();

        consumerExample();

        supplierExample();
    }

    private static void predicateExample() {

        Predicate<Person> isAdult = person -> person.getAge() >= 18;

        Person person = new Person("João", 21);

        System.out.println("Is adult: " + isAdult.test(person));
    }

    private static void functionExample() {

        Function<Person, String> getName = person -> person.getName();

        Person person = new Person("Maria", 34);

        String name = getName.apply(person);

        System.out.println("Name: " + name);
    }

    private static void consumerExample() {

        Consumer<Person> printPerson = person -> System.out.println(person);

        Person person = new Person("Carlos", 42);

        printPerson.accept(person);
    }

    private static void supplierExample() {

        Supplier<Person> createPerson = () -> new Person("Ana", 27);

        Person person = createPerson.get();

        System.out.println("Person: " + person);
    }
}