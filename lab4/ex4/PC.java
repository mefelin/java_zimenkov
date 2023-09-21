package lab4.ex4;

enum Brand {
    HP, DELL, ASUS, ACER, LENOVO
}

class Processor {
    private String model;
    private double clockSpeedGHz;
    private int cores;

    public Processor(String model, double clockSpeedGHz, int cores) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return model + " (Clock Speed: " + clockSpeedGHz + "GHz, Cores: " + cores + ")";
    }
}

class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return sizeGB + "GB " + type + " Memory";
    }
}

class Monitor {
    private String model;
    private int sizeInches;

    public Monitor(String model, int sizeInches) {
        this.model = model;
        this.sizeInches = sizeInches;
    }

    public String getModel() {
        return model;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    @Override
    public String toString() {
        return model + " (" + sizeInches + " inches)";
    }
}

class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer [Brand: " + brand + ", Processor: " + processor + ", Memory: " + memory + ", Monitor: " + monitor + "]";
    }
}

public class PC {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.4, 8);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27);
        Computer computer = new Computer(Brand.ASUS, processor, memory, monitor);

        System.out.println("Computer Details:");
        System.out.println(computer);
    }
}
