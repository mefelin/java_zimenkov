package lab4.ex1;

enum Seasonss {
    SPRING("средняя температура весной: 17°C"),
    SUMMER("средняя температура летом: 25°C"),
    AUTUMN("средняя температура осенью: 13°C"),
    WINTER("средняя температура зимой: -5°C");

    private final String temperature;

    Seasonss(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return temperature;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Seasonss favoriteSeason = Seasonss.SPRING;

        System.out.println("Мое любимое время года - это " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getTemperature());
    }
}
