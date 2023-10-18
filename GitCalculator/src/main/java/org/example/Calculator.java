package org.example;

import java.util.Scanner;

public class Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе");
        }
        return num1 / num2;
    }

    public static double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Квадратний корінь з від'ємного числа неможливий");
        }
        return Math.sqrt(num);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Виберіть операцію (+, -, *, /, sqrt, pow): ");
        String operation = scanner.next();

        double result = 0;

        switch (operation) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                try {
                    result = divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            case "sqrt":
                try {
                    result = squareRoot(num1);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            case "pow":
                result = power(num1, num2);
                break;
            default:
                System.out.println("Невірна операція.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}


