package lab3;

import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите корректное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array = new int[n];
        Random random = new Random();

        System.out.println("Сгенерированный массив из " + n + " случайных целых чисел:");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + " ");
        }

        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                evenCount++;
            }
        }

        if (evenCount > 0) {
            int[] evenArray = new int[evenCount];
            int index = 0;

            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    evenArray[index] = array[i];
                    index++;
                }
            }

            System.out.println("\nМассив из " + evenCount + " нечетных элементов первого массива:");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(evenArray[i] + " ");
            }
        } else {
            System.out.println("\nВ исходном массиве нет нечетных элементов.");
        }
    }
}