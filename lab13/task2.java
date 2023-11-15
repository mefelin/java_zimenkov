package prac13;

public class task2 {

    public static String formatPhoneNumber(String inputNumber) {
        String formattedNumber;
        String digitsOnly = inputNumber.replaceAll("[^\\d]", "");
        if (digitsOnly.length() == 11 && digitsOnly.startsWith("8")) {
            // +<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
            formattedNumber = "+" + digitsOnly.substring(0,1) + digitsOnly.substring(1,4) + "-" + digitsOnly.substring(4,7) + "-" + digitsOnly.substring(7,11);
        } else if (digitsOnly.length() == 11 && inputNumber.startsWith("+") && inputNumber.length() == 12) {
            // Формат +<Код страны><Номер 10 цифр>
            formattedNumber = inputNumber.substring(0,1) + digitsOnly.substring(0,1) + digitsOnly.substring(1,4) + "-" + digitsOnly.substring(4,7) + "-" + digitsOnly.substring(7,11);
        } else {
            // Некорректный формат номера
            formattedNumber = "Некорректный номер";
        }
        return formattedNumber;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";
        String phoneNumber4 = "+?79175655655";

        String formattedNumber1 = formatPhoneNumber(phoneNumber1);
        String formattedNumber2 = formatPhoneNumber(phoneNumber2);
        String formattedNumber3 = formatPhoneNumber(phoneNumber3);
        String formattedNumber4 = formatPhoneNumber(phoneNumber4);

        System.out.println("Форматированный номер 1: " + formattedNumber1);
        System.out.println("Форматированный номер 2: " + formattedNumber2);
        System.out.println("Форматированный номер 3: " + formattedNumber3);
        System.out.println("Форматированный номер 4: " + formattedNumber4);
    }
}
