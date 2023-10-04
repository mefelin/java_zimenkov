package lab4_1.abstract_classes;

class TransportTest {
    public static void main(String[] args) {
        Car car = new Car("Легковой автомобиль", 120.0, 0.1);
        car.transportPassengers(4);
        car.transportCargo(200.0);

        Airplane airplane = new Airplane("Пассажирский самолет", 900.0, 0.5);
        airplane.transportPassengers(150);
        airplane.transportCargo(5000.0);

        Train train = new Train("Поезд", 160.0, 0.2);
        train.transportPassengers(300);
        train.transportCargo(1000.0);

        Ship ship = new Ship("Грузовой корабль", 25.0, 0.05);
        ship.transportPassengers(500);
        ship.transportCargo(10000.0);
    }
}

// Абстрактный класс TransportVehicle
abstract class TransportVehicle {
    private String name;
    private double speed; // Скорость в км/ч
    private double costPerKm; // Стоимость перевозки за 1 км

    public TransportVehicle(String name, double speed, double costPerKm) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public double calculateTime(double distance) {
        return distance / speed;
    }

    public double calculateCost(double distance) {
        return distance * costPerKm;
    }

    public String getName() {
        return name;
    }

    public abstract void transportPassengers(int numberOfPassengers);

    public abstract void transportCargo(double cargoWeight);
}

// Подкласс Car (Автомобиль)
class Car extends TransportVehicle {
    public Car(String name, double speed, double costPerKm) {
        super(name, speed, costPerKm);
    }

    @Override
    public void transportPassengers(int numberOfPassengers) {
        double distance = 100.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Автомобиль " + getName() + " перевез " + numberOfPassengers + " пассажиров.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }

    @Override
    public void transportCargo(double cargoWeight) {
        double distance = 100.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Автомобиль " + getName() + " перевез груз весом " + cargoWeight + " кг.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }
}

// Подкласс Airplane (Самолет)
class Airplane extends TransportVehicle {
    public Airplane(String name, double speed, double costPerKm) {
        super(name, speed, costPerKm);
    }

    @Override
    public void transportPassengers(int numberOfPassengers) {
        double distance = 1000.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Самолет " + getName() + " перевез " + numberOfPassengers + " пассажиров.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }

    @Override
    public void transportCargo(double cargoWeight) {
        double distance = 500.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Самолет " + getName() + " перевез груз весом " + cargoWeight + " кг.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }
}

// Подкласс Train (Поезд)
class Train extends TransportVehicle {
    public Train(String name, double speed, double costPerKm) {
        super(name, speed, costPerKm);
    }

    @Override
    public void transportPassengers(int numberOfPassengers) {
        double distance = 300.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Поезд " + getName() + " перевез " + numberOfPassengers + " пассажиров.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }

    @Override
    public void transportCargo(double cargoWeight) {
        double distance = 200.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Поезд " + getName() + " перевез груз весом " + cargoWeight + " кг.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }
}

// Подкласс Ship (Корабль)
class Ship extends TransportVehicle {
    public Ship(String name, double speed, double costPerKm) {
        super(name, speed, costPerKm);
    }

    @Override
    public void transportPassengers(int numberOfPassengers) {
        double distance = 500.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Корабль " + getName() + " перевез " + numberOfPassengers + " пассажиров.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }

    @Override
    public void transportCargo(double cargoWeight) {
        double distance = 1000.0; // Пример расстояния в км
        double time = calculateTime(distance);
        double cost = calculateCost(distance);

        System.out.println("Корабль " + getName() + " перевез груз весом " + cargoWeight + " кг.");
        System.out.println("Время в пути: " + time + " часов");
        System.out.println("Стоимость перевозки: $" + cost);
    }
}
