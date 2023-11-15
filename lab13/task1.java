package prac13;

public class task1 {

    public static void main(String[] args) {
        String inputString = "I like Java!!!";
            // 2. Распечатать последний символ строки
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

            // 3. Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Заканчивается ли строка подстрокой \"!!!\": " + endsWithExclamation);

            // 4. Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Начинается ли строка подстрокой \"I like\": " + startsWithILike);

            // 5. Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = inputString.contains("Java");
        System.out.println("Содержит ли строка подстроку \"Java\": " + containsJava);

            // 6. Найти позицию подстроки "Java" в строке "I like Java!!!"
        int positionOfJava = inputString.indexOf("Java");
        System.out.println("Позиция подстроки \"Java\" в строке: " + positionOfJava);

            // 7. Заменить все символы "а" на "о"
        String replacedString = inputString.replace('a', 'o');
        System.out.println("Строка после замены символов 'а' на 'о': " + replacedString);

            // 8. Преобразовать строку к верхнему регистру
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистру: " + uppercaseString);

            // 9. Преобразовать строку к нижнему регистру
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистру: " + lowercaseString);

            // 10. Вырезать строку "Java" с помощью метода String.substring()
        String substring = inputString.substring(inputString.indexOf("Java"), inputString.indexOf("Java") + 4);
        System.out.println("Вырезанная подстрока: " + substring);
    }
}
