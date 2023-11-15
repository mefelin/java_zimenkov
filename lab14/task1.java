package lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Разбить строку на слова");
            System.out.println("2. Найти все числа в строке");
            System.out.println("3. Заменить пробелы на подчеркивания");
            System.out.println("4. Выйти из программы");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистить буфер после считывания числа

            switch (choice) {
                case 1:
                    splitStringIntoWords(inputString);
                    break;
                case 2:
                    findNumbersInString(inputString);
                    break;
                case 3:
                    replaceSpacesWithUnderscores(inputString);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
                    break;
            }
        }
    }

    private static void splitStringIntoWords(String inputString) {
        String[] words = inputString.split("\\s+");
        System.out.println("Разбитие строки на слова:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void findNumbersInString(String inputString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("Найденные числа в строке:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void replaceSpacesWithUnderscores(String inputString) {
        String replacedString = inputString.replaceAll("\\s", "_");
        System.out.println("Строка с замененными пробелами на подчеркивания:");
        System.out.println(replacedString);
    }
}
