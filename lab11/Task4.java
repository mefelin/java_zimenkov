package lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных пользователя
        Scanner scanner = new Scanner(System.in);

        try {
            // Запрашиваем у пользователя ввод даты и времени в определенном формате
            System.out.print("Введите дату (годМесяцДень): ");
            String dateInput = scanner.nextLine();

            System.out.print("Введите время (часыминуты): ");
            String timeInput = scanner.nextLine();

            // Собираем дату и время в одну строку для парсинга
            String dateTimeInput = dateInput + timeInput;

            // Создаем объект SimpleDateFormat для парсинга введенной строки
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");

            // Парсим введенную дату и время
            Date date = dateFormat.parse(dateTimeInput);

            // Создаем объект Calendar и устанавливаем его значение в соответствии с введенной датой и временем
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Выводим результат
            System.out.println("Введенная дата и время: " + date);
            System.out.println("Введенная дата и время в формате Calendar: " + calendar.getTime());
        } catch (ParseException e) {
            System.err.println("Ошибка при парсинге введенной даты и времени.");
        } finally {
            // Закрываем Scanner
            scanner.close();
        }
    }
}
