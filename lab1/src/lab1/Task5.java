package lab1;
import java.math.BigInteger;

public class Task5 {
    public static BigInteger calculateFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        int startNum = 100000;
        int endNum = 300000;

        for (int num = startNum; num <= endNum; num += 100000) {
            long startTime = System.currentTimeMillis();
            BigInteger factorial = calculateFactorial(num);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.println("Факториал числа " + num + ": " + factorial);
            System.out.println("Время выполнения: " + executionTime + " мс");
            System.out.println();
        }
    }
}
