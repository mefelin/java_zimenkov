package lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Создаем объект для форматирования даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Получаем текущую системную дату и время
        Date currentDate = new Date();

        System.out.println("Текущая системная дата и время: " + dateFormat.format(currentDate));

        // Создаем объект Scanner для ввода данных пользователя
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату и время в формате 'yyyy-MM-dd HH:mm:ss': ");
        String userInput = scanner.nextLine();

        try {
            // Парсим дату, введенную пользователем
            Date userDate = dateFormat.parse(userInput);

            // Сравниваем даты
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата и время раньше текущей системной даты и времени.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата и время позже текущей системной даты и времени.");
            } else {
                System.out.println("Введенная дата и время совпадает с текущей системной датой и временем.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка при парсинге даты. Убедитесь, что формат ввода соответствует 'yyyy-MM-dd HH:mm:ss'.");
        }

        // Закрываем Scanner
        scanner.close();
    }
}
