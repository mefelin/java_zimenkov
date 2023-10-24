package lab8;

public class NumberReversal {
    public static int reverseNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int reversedNumber = reverseNumber(remainingDigits);
            int reversed = (int) (lastDigit * Math.pow(10, (int) Math.log10(remainingDigits) + 1));
            return reversed + reversedNumber;
        }
    }

    public static void main(String[] args) {
        int number = 1234567890;
        int reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber); // Вывод
    }
}
