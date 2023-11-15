package prac13;

class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String code, String name, String color, String size) {
        this.code = code;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Код товара: " + code + "\nНазвание: " + name + "\nЦвет: " + color + "\nРазмер: " + size + "\n";
    }
}

public class task3 {
    public static void main(String[] args) {
        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[shirtsData.length];
        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtInfo = shirtsData[i].split(",");
            shirts[i] = new Shirt(shirtInfo[0], shirtInfo[1], shirtInfo[2], shirtInfo[3]);
        }

        for (Shirt shirt : shirts) {
            System.out.println(shirt);
        }
    }
}

