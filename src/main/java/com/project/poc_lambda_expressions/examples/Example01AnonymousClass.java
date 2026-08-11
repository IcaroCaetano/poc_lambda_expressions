package com.project.poc_lambda_expressions.examples;


import com.project.poc_lambda_expressions.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example01AnonymousClass {

    public static void main(String[] args) {

        List<Person> people = createPeople();

        System.out.println("=== Before Sorting ===");
        printPeople(people);

        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {

                return Integer.compare(p1.getAge(), p2.getAge());
            }

        });

        System.out.println("\n=== After Sorting (Anonymous Class) ===");
        printPeople(people);
    }

    private static List<Person> createPeople() {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Maria", 34));
        people.add(new Person("João", 21));
        people.add(new Person("Carlos", 42));
        people.add(new Person("Ana", 27));

        return people;
    }

    private static void printPeople(List<Person> people) {

        for (Person person : people) {
            System.out.println(person);
        }
    }

}