package Task2;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double numerator = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double denominator = scanner.nextDouble();

        try {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double divideNumbers(double numerator, double denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return numerator / denominator;
    }
}