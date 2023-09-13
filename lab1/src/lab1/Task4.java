package lab1;

public class Task4 {
    public static void main(String[] args) {
        // Вывод первых 10 чисел гармонического ряда
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("Число %2d: %.3f%n", i, harmonic);
        }
    }
}
