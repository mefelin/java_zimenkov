package lab4_1.abstract_classes;

// Абстрактный класс Furniture
abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Класс Chair наследуется от Furniture
class Chair extends Furniture {
    private int legs;

    public Chair(String name, double price, int legs) {
        super(name, price);
        this.legs = legs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName());
        System.out.println("Цена: $" + getPrice());
        System.out.println("Количество ног: " + legs);
    }
}

// Класс Table наследуется от Furniture
class Table extends Furniture {
    private int seats;

    public Table(String name, double price, int seats) {
        super(name, price);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName());
        System.out.println("Цена: $" + getPrice());
        System.out.println("Количество мест: " + seats);
    }
}

// Класс FurnitureShop моделирует магазин мебели
class FurnitureShop {
    private String name;
    private Furniture[] inventory;

    public FurnitureShop(String name, int capacity) {
        this.name = name;
        this.inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture furniture) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = furniture;
                System.out.println(furniture.getName() + " добавлен в магазин " + name);
                return;
            }
        }
        System.out.println("Магазин " + name + " заполнен. Невозможно добавить " + furniture.getName());
    }

    public void displayInventory() {
        System.out.println("Инвентарь магазина " + name + ":");
        for (Furniture furniture : inventory) {
            if (furniture != null) {
                furniture.displayInfo();
                System.out.println("-------------");
            }
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop("Мебельный магазин №1", 10);

        Chair chair1 = new Chair("Стул деревянный", 50.0, 4);
        Chair chair2 = new Chair("Стул пластиковый", 30.0, 3);
        Table table1 = new Table("Стол кухонный", 100.0, 4);
        Table table2 = new Table("Стол обеденный", 150.0, 6);

        shop.addFurniture(chair1);
        shop.addFurniture(chair2);
        shop.addFurniture(table1);
        shop.addFurniture(table2);

        shop.displayInventory();
    }
}
