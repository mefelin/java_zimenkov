package lab16;

import javax.swing.*;
import java.awt.*;

public class task3 extends JFrame {
    private JTextField serviceField;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public task3() {
        setTitle("Проверка пароля");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        createUI();

        setVisible(true);
    }

    private void createUI() {
        setLayout(new GridLayout(3, 2));

        JLabel serviceLabel = new JLabel("Service:");
        serviceField = new JTextField();

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        add(serviceLabel);
        add(serviceField);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(task3::new);
    }
}
