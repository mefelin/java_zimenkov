package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {

    public static void main(String[] args) {
        String text = "Пример текста со списками цен: 25.98 USD, 100 RUB, 12.5 EU. Некорректные выражения: 44 ERR, 0.004 EU.";

        extractPrices(text);
    }

    private static void extractPrices(String text) {
        // Регулярное выражение для извлечения цен в USD, RUB и EU
        String regex = "\\b(\\d+\\.\\d+)\\s+(USD|RUB|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Извлеченные цены:");
        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);
            System.out.println(price + " " + currency);
        }
    }
}
