package lab7;

public class main {
    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(2, 4, 8, 2);
        System.out.println(movableRectangle.toString());
        movableRectangle.moveDown();
        System.out.println(movableRectangle.toString());
    }
}
