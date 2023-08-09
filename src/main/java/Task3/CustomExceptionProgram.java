package Task3;

import java.util.Scanner;

public class CustomExceptionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int thirdNumber = scanner.nextInt();

        try {
            checkFirstNumber(firstNumber);
            checkSecondNumber(secondNumber);
            checkSum(firstNumber, secondNumber);
            checkThirdNumber(thirdNumber);

            System.out.println("Проверка пройдена успешно");
        } catch (NumberOutOfRangeException | NumberSumException | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkFirstNumber(int number) throws NumberOutOfRangeException {
        if (number > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
    }

    public static void checkSecondNumber(int number) throws NumberOutOfRangeException {
        if (number < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    public static void checkSum(int firstNumber, int secondNumber) throws NumberSumException {
        if (firstNumber + secondNumber < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }

    public static void checkThirdNumber(int number) throws DivisionByZeroException {
        if (number == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}
