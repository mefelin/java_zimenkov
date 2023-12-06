package lab17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class task3 extends JFrame {
    private List<String> tasks;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;

    public task3() {
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        add(scrollPane);

        JButton addButton = new JButton("Add Task");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String task = JOptionPane.showInputDialog(task3.this, "Enter task:");
                if (task != null && !task.isEmpty()) {
                    addTask(task);
                    refreshTaskList();
                }
            }
        });

        JButton deleteButton = new JButton("Delete Task");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    deleteTask(selectedIndex);
                    refreshTaskList();
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, "South");

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Task List");
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void refreshTaskList() {
        listModel.clear();
        for (String task : tasks) {
            listModel.addElement(task);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                task3 taskMVC = new task3();
                taskMVC.setVisible(true);
            }
        });
    }
}
