package lab5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}

public class RandomShapesApp extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private final Shape[] shapes;

    public RandomShapesApp() {
        shapes = new Shape[NUM_SHAPES];
        Random random = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            int shapeType = random.nextInt(2); // 0 for Circle, 1 for Rectangle

            if (shapeType == 0) {
                int radius = random.nextInt(50) + 20; // Random radius between 20 and 70
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else {
                int width = random.nextInt(100) + 20; // Random width between 20 and 120
                int height = random.nextInt(100) + 20; // Random height between 20 and 120
                shapes[i] = new Rectangle(randomColor, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            RandomShapesApp shapesApp = new RandomShapesApp();
            frame.add(shapesApp);
            frame.setSize(WIDTH, HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
