package lab4_1.Inheritance;

class Person {
    private final String fullName;
    private final int age;

    // Конструктор без аргументов
    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }

    // Конструктор с аргументами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для движения
    public void move() {
        System.out.println(fullName + " двигается.");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();
        System.out.println("Имя: " + person1.fullName);
        System.out.println("Возраст: " + person1.age);

        Person person2 = new Person("Иван", 30);
        person2.move();
        person2.talk();
        System.out.println("Имя: " + person2.fullName);
        System.out.println("Возраст: " + person2.age);
    }
}
