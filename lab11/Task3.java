package lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private Date birthDate; // Добавляем поле для даты рождения

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Метод для предоставления строкового представления даты рождения
    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Дата рождения: " + getFormattedBirthDate("dd.MM.yyyy");
    }

    public static void main(String[] args) {
        // Пример использования
        Date birthDate = new Date(); // Здесь должна быть установлена фактическая дата рождения
        Student student = new Student("Иванов Иван", birthDate);

        // Вывод информации о студенте в разных форматах даты
        System.out.println(student.toString());
        System.out.println("Дата рождения в коротком формате: " + student.getFormattedBirthDate("dd.MM.yyyy"));
        System.out.println("Дата рождения в среднем формате: " + student.getFormattedBirthDate("dd MMMM yyyy"));
        System.out.println("Дата рождения в полном формате: " + student.getFormattedBirthDate("dd MMMM yyyy, EEEE"));
    }
}
