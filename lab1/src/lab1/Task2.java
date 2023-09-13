package lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Ввод массива с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            arr[i] = scanner.nextInt();
        }

        // Вычисление суммы элементов массива
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Нахождение максимального и минимального элементов
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }
        }

        // Вывод результатов на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + maxNum);
        System.out.println("Минимальный элемент: " + minNum);
    }
}
