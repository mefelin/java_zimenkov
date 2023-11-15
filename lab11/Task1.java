package lab11;

import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerLastName = "Зименков";

        // Дата и время получения задания
        Date assignmentDate = new Date();

        // Дата и время сдачи задания (допустим, 7 дней после получения)
        long submissionTimeMillis = System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000; // 7 дней в миллисекундах
        Date submissionDate = new Date(submissionTimeMillis);

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentDate);
        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
