package com.project.poc_lambda_expressions.examples;

public class Example05Runnable {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Executando thread...");

        Thread thread = new Thread(task);

        thread.start();

        /**
         * Forma antiga usando Classe anonima
         *
         * Thread thread = new Thread(new Runnable() {
         *
         *     @Override
         *     public void run() {
         *         System.out.println("Executando thread...");
         *     }
         *
         * });
         *
         * thread.start();
         */
    }
}