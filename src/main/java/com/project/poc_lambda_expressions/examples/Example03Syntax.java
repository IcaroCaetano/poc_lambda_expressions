package com.project.poc_lambda_expressions.examples;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example03Syntax {

    public static void main(String[] args) {

        example01NoParameters();

        example02OneParameter();

        example03MultipleParameters();

        example04ExplicitTypes();

        example05ExpressionBody();

        example06BlockBody();

        example07MultipleStatements();
    }

    private static void example01NoParameters() {

        Runnable runnable = () -> System.out.println("Hello Lambda");

        runnable.run();
    }

    private static void example02OneParameter() {

        Consumer<String> consumer = name -> System.out.println("Hello " + name);

        consumer.accept("Java");
    }

    private static void example03MultipleParameters() {

        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        System.out.println(sum.apply(10, 20));
    }

    // Tipos Explicitos
    private static void example04ExplicitTypes() {

        BiFunction<Integer, Integer, Integer> sum = (Integer a, Integer b) -> a + b;

        System.out.println(sum.apply(10, 20));
    }

    private static void example05ExpressionBody() {

        Function<Integer, Integer> doubleValue = value -> value * 2;

        System.out.println(doubleValue.apply(10));
    }

    //  Lambda utilizando bloco
    private static void example06BlockBody() {

        Function<Integer, Integer> doubleValue =
                value -> {
                    return value * 2;
                };

        System.out.println(doubleValue.apply(10));
    }

    private static void example07MultipleStatements() {

        BiFunction<Integer, Integer, Integer> calculate =
                (a, b) -> {

                    int sum = a + b;
                    int result = sum * 2;

                    return result;
                };

        System.out.println(calculate.apply(10, 20));
    }
}