package lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task1 extends JFrame {
    private int targetNumber;
    private int attemptsLeft;

    private JTextField textField;
    private JButton guessButton;

    public task1() {
        setTitle("Угадай число");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        targetNumber = (int) (Math.random() * 21); // Генерация случайного числа от 0 до 20
        attemptsLeft = 3;

        setupUI();
    }

    private void setupUI() {
        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Угадай число от 0 до 20");
        add(welcomeLabel, BorderLayout.NORTH);

        textField = new JTextField();
        add(textField, BorderLayout.CENTER);

        guessButton = new JButton("Угадать");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guessNumber();
            }
        });
        add(guessButton, BorderLayout.SOUTH);

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showWelcomeDialog(evt);
            }
        });
    }

    private void guessNumber() {
        try {
            int userGuess = Integer.parseInt(textField.getText());

            if (userGuess == targetNumber) {
                JOptionPane.showMessageDialog(this, "Поздравляем! Вы угадали число " + targetNumber);
                System.exit(0);
            } else {
                attemptsLeft--;
                if (attemptsLeft > 0) {
                    String message = "Неверно! ";
                    if (userGuess < targetNumber) {
                        message += "Число больше.";
                    } else {
                        message += "Число меньше.";
                    }
                    message += " Осталось попыток: " + attemptsLeft;
                    JOptionPane.showMessageDialog(this, message);
                } else {
                    JOptionPane.showMessageDialog(this, "Вы исчерпали все попытки. Загаданное число было: " + targetNumber);
                    System.exit(0);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите корректное число.");
        }
    }

    private void showWelcomeDialog(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == this) {
            String area = "";

            if (evt.getX() < getWidth() / 5) {
                area = "ЗАО";
            } else if (evt.getX() > getWidth() * 4 / 5) {
                area = "ВАО";
            } else if (evt.getY() < getHeight() / 5) {
                area = "САО";
            } else if (evt.getY() > getHeight() * 4 / 5) {
                area = "ЮАО";
            } else {
                area = "ЦАО";
            }

            JOptionPane.showMessageDialog(this, "Добро пожаловать в " + area);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new task1().setVisible(true);
            }
        });
    }
}
