package lab6;

import lab6.Nameable;

// Класс, представляющий планету
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Класс, представляющий машину
class Car implements Nameable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Класс, представляющий животное
class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class Task3 {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Nameable
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota Camry");
        Nameable animal = new Animal("Лев");

        // Выводим имена объектов
        System.out.println("Имя планеты: " + planet.getName());
        System.out.println("Имя машины: " + car.getName());
        System.out.println("Имя животного: " + animal.getName());
    }
}
