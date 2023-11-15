package lab14;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для проверки:");
        String input = scanner.nextLine();
        String regex = "abcdefghijklmnopqrstuv18340";

        if (input.matches(regex)) {
            System.out.println("Строка соответствует шаблону.");
        } else {
            System.out.println("Строка не соответствует шаблону.");
        }

        scanner.close();
    }
}
