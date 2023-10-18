package prac9;

import java.util.Arrays;
import java.util.Comparator;

class Students {
    private int iDNumber;
    private String name;

    public Students(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Task1 {
    public static void main(String[] args) {
        Students[] students = {
                new Students(102, "Alice"),
                new Students(101, "Bob"),
                new Students(105, "Charlie"),
                new Students(103, "David"),
                new Students(104, "Eve")
        };

        System.out.println("Before sorting:");
        for (Students student : students) {
            System.out.println(student);
        }

        // Sorting the array using insertion sort
        insertionSort(students, Comparator.comparing(Students::getIDNumber));

        System.out.println("\nAfter sorting by iDNumber:");
        for (Students student : students) {
            System.out.println(student);
        }
    }

    public static <T> void insertionSort(T[] arr, Comparator<? super T> comparator) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
