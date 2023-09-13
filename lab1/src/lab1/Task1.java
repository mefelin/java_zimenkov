package lab1;

public class Task1 {
    public static void main(String[] args) {
        // Инициализация массива
        int[] arr = {3, 8, 6, 5, 1, 12, 7};

        // Вычисление суммы элементов массива
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // Вычисление среднего арифметического
        double average = (double) sum / arr.length;

        // Вывод результатов на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
