import java.util.Scanner;

public class Calculator {

    public static double performOperation(double num1, double num2, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ділення на нуль неможливе.");
                }
                break;
            default:
                System.out.println("Невірна операція.");
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Виберіть операцію (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = performOperation(num1, num2, operator);
        System.out.println("Результат: " + result);
    }
}

