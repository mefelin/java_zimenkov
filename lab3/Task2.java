package lab3;

import java.util.Arrays;
import java.util.Random;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
}

class Tester {
    private Circle[] circles;
    private int numCircles;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        numCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numCircles < circles.length) {
            circles[numCircles] = circle;
            numCircles++;
        } else {
            System.out.println("Массив окружностей полон. Нельзя добавить больше элементов.");
        }
    }

    public Circle findSmallestCircle() {
        if (numCircles == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < numCircles; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (numCircles == 0) {
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < numCircles; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, numCircles, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public void displayCircles() {
        for (int i = 0; i < numCircles; i++) {
            System.out.println(circles[i]);
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Tester tester = new Tester(10); // Создаем массив для хранения окружностей

        // Генерируем и добавляем окружности с случайными радиусами и координатами центров
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double x = random.nextDouble() * 10; // Случайная координата x
            double y = random.nextDouble() * 10; // Случайная координата y
            double radius = random.nextDouble() * 5; // Случайный радиус
            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        // Выводим окружности в порядке добавления
        System.out.println("Окружности в порядке добавления:");
        tester.displayCircles();

        // Находим и выводим самую маленькую и самую большую окружности
        Circle smallestCircle = tester.findSmallestCircle();
        Circle largestCircle = tester.findLargestCircle();

        if (smallestCircle != null) {
            System.out.println("Самая маленькая окружность: " + smallestCircle);
        } else {
            System.out.println("Нет окружностей.");
        }

        if (largestCircle != null) {
            System.out.println("Самая большая окружность: " + largestCircle);
        } else {
            System.out.println("Нет окружностей.");
        }

        // Сортируем окружности по радиусу и выводим
        tester.sortCirclesByRadius();
        System.out.println("\nОкружности, отсортированные по радиусу:");
        tester.displayCircles();
    }
}