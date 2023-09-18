package lab2;

public class Task8 {
    public static void main(String[] args) {
        String[] array = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0"};

        System.out.println("Исходный массив:");
        printArray(array);

        // Переворачиваем массив
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        System.out.println("Массив после обращения:");
        printArray(array);
    }
    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}