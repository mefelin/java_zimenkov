package prac12;

import java.awt.*;
import javax.swing.*;

abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
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
        g.setColor(color);
        g.fillOval(x, y, 2 * radius, 2 * radius);
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
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

public class Task1 extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public Task1() {
        shapes = new Shape[NUM_SHAPES];
        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = (int) (Math.random() * (WIDTH - 50));
            int y = (int) (Math.random() * (HEIGHT - 50));
            Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

            if (Math.random() < 0.5) {
                int radius = (int) (20 + Math.random() * 50);
                shapes[i] = new Circle(color, x, y, radius);
            } else {
                int width = (int) (20 + Math.random() * 100);
                int height = (int) (20 + Math.random() * 100);
                shapes[i] = new Rectangle(color, x, y, width, height);
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
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(new Task1());
        frame.setVisible(true);
    }
}
