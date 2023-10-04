package lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationApp extends JPanel implements ActionListener {
    private int currentFrame = 0;
    private Timer timer;
    private ImageIcon[] frames;

    public AnimationApp() {
        // Загрузите изображения с кадрами анимации
        frames = new ImageIcon[5]; // Предположим, что у вас есть 5 кадров
        for (int i = 0; i < 5; i++) {
            frames[i] = new ImageIcon("filename" + i + ".png");
        }

        // Создайте таймер для обновления кадров анимации
        timer = new Timer(100, this); // 100 миллисекунд между кадрами
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Отображение текущего кадра анимации
        frames[currentFrame].paintIcon(this, g, 0, 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Переключение на следующий кадр анимации
        currentFrame = (currentFrame + 1) % frames.length;
        repaint(); // Перерисовать панель с новым кадром
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Animation");
            AnimationApp animationApp = new AnimationApp();
            frame.add(animationApp);
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
