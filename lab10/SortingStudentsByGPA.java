package prac10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] students;

    public SortingStudentsByGPA(Student[] students) {
        this.students = students;
    }

    // Метод для заполнения массива студентов
    public void setArray(Student[] students) {
        this.students = students;
    }

    // Метод для сортировки студентов по среднему баллу с использованием быстрой сортировки
    public void quicksort() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                // Сортировка в порядке убывания среднего балла
                return Double.compare(student2.getGPA(), student1.getGPA());
            }
        });
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", "Иванов", 4.5),
                new Student("Мария", "Петрова", 4.2),
                new Student("Петр", "Сидоров", 4.8),
                new Student("Анна", "Кузнецова", 4.0),
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA(students);

        // Вывод исходного массива
        System.out.println("Исходный массив студентов:");
        sorter.outArray();

        // Сортировка по среднему баллу и вывод отсортированного массива
        sorter.quicksort();
        System.out.println("\nОтсортированный массив студентов по среднему баллу:");
        sorter.outArray();
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + GPA + ")";
    }
}
