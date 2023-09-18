package lab2;

// Класс Point представляет точку на плоскости.
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
}

// Класс Circle представляет окружность с центром в заданной точке и радиусом.
class Circle {
    private final Point center;
    private final double radius;

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
}

// Класс Tester используется для хранения массива объектов Circle и количества элементов.
class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон. Невозможно добавить больше окружностей.");
        }
    }

    public void printCircles() {
        for (int i = 0; i < count; i++) {
            Circle circle = circles[i];
            System.out.println("Окружность " + (i + 1));
            System.out.println("Центр: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
            System.out.println("Радиус: " + circle.getRadius());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Point center1 = new Point(3.0, 5.0);
        Circle circle1 = new Circle(center1, 7.0);

        Point center2 = new Point(12.0, 9.0);
        Circle circle2 = new Circle(center2, 5.5);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.printCircles();
    }
}