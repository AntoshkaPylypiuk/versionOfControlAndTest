package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        double additionResult = calculator.add(num1, num2);
        double subtractionResult = calculator.subtract(num1, num2);
        double multiplicationResult = calculator.multiply(num1, num2);
        double divisionResult = 0;
        try {
            divisionResult = calculator.divide(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        double sqrtResult = 0;
        try {
            sqrtResult = calculator.squareRoot(num1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Введіть ступінь для піднесення: ");
        double exponent = scanner.nextDouble();
        double powerResult = calculator.power(num1, exponent);

        // Виводимо результати обчислень
        System.out.println("Додавання: " + additionResult);
        System.out.println("Віднімання: " + subtractionResult);
        System.out.println("Множення: " + multiplicationResult);
        System.out.println("Ділення: " + divisionResult);
        System.out.println("Квадратний корінь: " + sqrtResult);
        System.out.println("Піднесення до ступеня: " + powerResult);
    }
}
