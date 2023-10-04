package lab6;

import lab6.Priceable;

// Класс, представляющий продукт
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс, представляющий автомобиль
class Cars implements Priceable {
    private String brand;
    private double price;

    public Cars(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс, представляющий недвижимость
class RealEstate implements Priceable {
    private String location;
    private double price;

    public RealEstate(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class Task4 {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Priceable
        Priceable product = new Product("Телевизор", 500.0);
        Priceable car = new Cars("Toyota Camry", 25000.0);
        Priceable realEstate = new RealEstate("Квартира в центре города", 150000.0);

        // Выводим цены объектов
        System.out.println("Цена продукта: $" + product.getPrice());
        System.out.println("Цена автомобиля: $" + car.getPrice());
        System.out.println("Цена недвижимости: $" + realEstate.getPrice());
    }
}
