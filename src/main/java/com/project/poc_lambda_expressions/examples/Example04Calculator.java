package com.project.poc_lambda_expressions.examples;


import com.project.poc_lambda_expressions.functional.Calculator;

public class Example04Calculator {

    public static void main(String[] args) {

        Calculator sum = (a, b) -> a + b;

        Calculator subtract = (a, b) -> a - b;

        Calculator multiply = (a, b) -> a * b;

        Calculator divide = (a, b) -> a / b;

        System.out.println("Sum: " + sum.calculate(10, 5));
        System.out.println("Subtract: " + subtract.calculate(10, 5));
        System.out.println("Multiply: " + multiply.calculate(10, 5));
        System.out.println("Divide: " + divide.calculate(10, 5));
    }
}