package lab4.ex1;

enum Seasons {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class Task2 {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;

        printSeasonMessage(favoriteSeason);
    }

    public static void printSeasonMessage(Seasons season) {
        switch (season) {
            case SPRING -> System.out.println("I love spring!");
            case SUMMER -> System.out.println("I love summer!");
            case AUTUMN -> System.out.println("I love autumn!");
            case WINTER -> System.out.println("I love winter!");
            default -> System.out.println("I don't have a favorite season for this.");
        }
    }
}
