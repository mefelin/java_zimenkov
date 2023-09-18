package lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        scanner.close();

        String[] words = inputText.split("\\s+");

        int wordCount = words.length;

        System.out.println("Количество слов в тексте: " + wordCount);
    }
}