package lab4_1.ex_1;

class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}

class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Square's side is the same as its width
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

class TestShapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1.toString());
        System.out.println("Площадь s1: " + ((Circle) s1).getArea());
        System.out.println("Периметр s1: " + ((Circle) s1).getPerimeter());
        System.out.println("Цвет s1: " + s1.getColor());
        System.out.println("Заполненность s1: " + s1.isFilled());
        System.out.println("Радиус s1: " + ((Circle) s1).getRadius());

        Circle c1 = (Circle) s1;
        System.out.println(c1.toString());
        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println("Периметр c1: " + c1.getPerimeter());
        System.out.println("Цвет c1: " + c1.getColor());
        System.out.println("Заполненность c1: " + c1.isFilled());
        System.out.println("Радиус c1: " + c1.getRadius());

        Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3.toString());
        System.out.println("Площадь s3: " + ((Rectangle) s3).getArea());
        System.out.println("Периметр s3: " + ((Rectangle) s3).getPerimeter());
        System.out.println("Цвет s3: " + s3.getColor());
        System.out.println("Длина s3: " + ((Rectangle) s3).getLength());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1.toString());
        System.out.println("Площадь r1: " + r1.getArea());
        System.out.println("Цвет r1: " + r1.getColor());
        System.out.println("Длина r1: " + r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4.toString());
        System.out.println("Площадь s4: " + ((Square) s4).getArea());
        System.out.println("Цвет s4: " + s4.getColor());
        System.out.println("Сторона s4: " + ((Square) s4).getSide());

        Square sq1 = (Square) s4;
        System.out.println(sq1.toString());
        System.out.println("Площадь sq1: " + sq1.getArea());
        System.out.println("Цвет sq1: " + sq1.getColor());
        System.out.println("Сторона sq1: " + sq1.getSide());
    }
}
