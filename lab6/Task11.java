package lab6;

// Интерфейс Convertable
interface Convertable {
    double convert(double celsius);
}

// Класс для конвертации температуры
class TemperatureConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        // Конвертация из Цельсия в Кельвины
        double kelvin = celsius + 273.15;

        // Конвертация из Цельсия в Фаренгейты
        double fahrenheit = (celsius * 9/5) + 32;

        return kelvin;
    }
}

public class Task11 {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0; // Температура в градусах Цельсия

        double kelvin = converter.convert(celsius); // Конвертация в Кельвины
        double fahrenheit = (celsius * 9/5) + 32; // Правильная конвертация в Фаренгейты

        System.out.println(celsius + " градусов Цельсия равны " + kelvin + " Кельвинам");
        System.out.println(celsius + " градусов Цельсия равны " + fahrenheit + " Фаренгейтам");
    }
}
