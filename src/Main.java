import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два числа, а посередине один из операторов вычисления(+,-,*,/)"
                + "\nпример: первое число + второе число, потом нажмите Enter для вывода результата\n");

        String expression = scanner.nextLine();
        String[] parts = expression.split("\\s+");

        if (parts.length != 3) {
            System.out.println("Неверный формат ввода. Введите допустимое выражение");
            return;
        }

        try {
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[2]);

            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                System.out.println("Числа должны быть от 1 до 10 (включительно)");
                return;
            }
            int result;
            switch (parts[1]) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Неверный оператор. Введите действительный оператор (+, -, *, /)");
                    return;
            }
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа. Введите допустимые целые числа");
        }
        scanner.close();
    }
}