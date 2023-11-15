package prac12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Task2 extends JPanel {
    private BufferedImage image;

    public Task2(BufferedImage image) {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JFrame frame = new JFrame("Изображение");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(image.getWidth(), image.getHeight());

            Task2 display = new Task2(image);
            frame.add(display);
            frame.setVisible(true);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке изображения: " + e.getMessage());
        }
    }
}
