package com.project.poc_lambda_expressions.examples;

import java.util.function.Consumer;

public class Example07VariableCapture {

    public static void main(String[] args) {

        String prefix = "Hello";

        Consumer<String> consumer = value -> System.out.println(prefix + " " + value);

        consumer.accept("Java");
        consumer.accept("Lambda");
    }
}