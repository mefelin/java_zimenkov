package prac9;

import java.util.Comparator;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class Task2 implements Comparator<Student> {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 4.0),
                new Student("David", 3.2),
                new Student("Eve", 3.9)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }

        // Sorting the array using quicksort and SortingStudentsByGPA comparator
        quickSort(students, new Task2());

        System.out.println("\nAfter sorting by GPA (descending order):");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }

    @Override
    public int compare(Student student1, Student student2) {
        // Compare students by GPA in descending order
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    public static <T> void quickSort(T[] arr, Comparator<? super T> comparator) {
        quickSort(arr, 0, arr.length - 1, comparator);
    }

    private static <T> void quickSort(T[] arr, int low, int high, Comparator<? super T> comparator) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, comparator);
            quickSort(arr, low, pivotIndex - 1, comparator);
            quickSort(arr, pivotIndex + 1, high, comparator);
        }
    }

    private static <T> int partition(T[] arr, int low, int high, Comparator<? super T> comparator) {
        T pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(arr[j], pivot) > 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
