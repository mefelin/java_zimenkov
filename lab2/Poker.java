package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();
        scanner.close();

        if (numPlayers < 1 || numPlayers > 10) {
            System.out.println("Недопустимое количество игроков. Введите число от 1 до 10.");
            return;
        }

        // Создаем колоду карт
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"П", "Ч", "Б", "К"}; // Пики, Черви, Бубны, Крести
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + suit);
            }
        }

        // Перетасовка колоды
        Collections.shuffle(deck);

        // Раздача карт
        int cardsPerPlayer = 5;
        int totalCards = numPlayers * cardsPerPlayer;

        if (totalCards > deck.size()) {
            System.out.println("Недостаточно карт в колоде для раздачи.");
            return;
        }

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                String card = deck.remove(0); // Берем карту из верха колоды
                System.out.println(card);
            }
            System.out.println(); // Пустая строка между игроками
        }
    }
}