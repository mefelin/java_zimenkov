package lab3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int arrayLength = 5; // Задайте желаемую длину массива

        // Генерация и вывод массива с использованием метода random() класса Math
        double[] randomArrayMath = new double[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            randomArrayMath[i] = Math.random();
        }
        System.out.println("Массив, сгенерированный с использованием Math.random():");
        System.out.println(Arrays.toString(randomArrayMath));

        // Сортировка массива с использованием метода sort()
        Arrays.sort(randomArrayMath);
        System.out.println("Отсортированный массив (с использованием Math.random()):");
        System.out.println(Arrays.toString(randomArrayMath));

        // Генерация и вывод массива с использованием класса Random
        double[] randomArrayRandomClass = new double[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            randomArrayRandomClass[i] = random.nextDouble();
        }
        System.out.println("\nМассив, сгенерированный с использованием класса Random:");
        System.out.println(Arrays.toString(randomArrayRandomClass));

        // Сортировка массива с использованием метода sort()
        Arrays.sort(randomArrayRandomClass);
        System.out.println("Отсортированный массив (с использованием класса Random):");
        System.out.println(Arrays.toString(randomArrayRandomClass));
    }
}