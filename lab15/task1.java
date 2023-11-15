package lab15;

import java.awt.*;
import java.awt.event.*;

public class task1 {
    public static void main(String[] args) {
        Frame f = new Frame("Калькулятор");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 250, 20);

        Button b1 = new Button("+");
        Button b2 = new Button("-");
        Button b3 = new Button("*");
        Button b4 = new Button("/");
        Button b5 = new Button("=");

        b1.setBounds(50, 150, 50, 30);
        b2.setBounds(120, 150, 50, 30);
        b3.setBounds(190, 150, 50, 30);
        b4.setBounds(260, 150, 50, 30);
        b5.setBounds(330, 150, 50, 30);

        final TextField num1 = new TextField();
        final TextField num2 = new TextField();

        num1.setBounds(50, 100, 50, 20);
        num2.setBounds(120, 100, 50, 20);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(num1);
        f.add(num2);
        f.add(tf);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
                tf.setText(String.valueOf(result));
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
                tf.setText(String.valueOf(result));
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
                tf.setText(String.valueOf(result));
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int divisor = Integer.parseInt(num2.getText());
                if (divisor != 0) {
                    int result = Integer.parseInt(num1.getText()) / divisor;
                    tf.setText(String.valueOf(result));
                } else {
                    tf.setText("Ошибка: деление на ноль");
                }
            }
        });
    }
}
