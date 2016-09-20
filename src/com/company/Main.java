package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner read;

    public static void main(String[] args) {
        while(2>0){
            System.out.println("format input string: (number) (operation(+ or - or * or / or ^)) (number)");
            read = new Scanner(System.in);
            if(read.findInLine("^(\\\\d+)(([\\\\+]|[\\\\-]|[\\\\^]|[\\\\*]|[\\\\/]){1})(\\\\d+)$") == null){System.out.println("check your input string");}
            while (read.findInLine("^(\\\\d+)(([\\\\+]|[\\\\-]|[\\\\^]|[\\\\*]|[\\\\/]){1})(\\\\d+)$") != null) {

                    double first;
                    double second;
                    String operator;

                    first = read.nextDouble();
                    operator = read.next();
                if (operator!="-"){System.out.print("op");}
                    second = read.nextDouble();


                    if (operator.equals("*")) {
                        System.out.print("answer: " + (first * second));
                    }
                    if (operator.equals("/")) {
                        System.out.print("answer: " + (first / second));
                    }
                    if (operator.equals("+")) {
                        System.out.print("answer: " + (first + second));
                    }
                    if (operator.equals("-")) {
                        System.out.print("answer: " + (first - second));
                    }
                    if (operator.equals("^")) {
                        System.out.print("answer: " + (Math.pow(first, second)));
                    }
                    System.exit(1);

                }
        }
    }
}
