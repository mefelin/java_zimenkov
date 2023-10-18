package lab7;

public class MovableRectangle implements Movable {
    private int TopLeft_X, TopLeft_Y, BottomRight_X, BottomRight_Y;

    public MovableRectangle(int topLeft_X, int topLeft_Y, int bottomRight_X, int bottomRight_Y) {
        TopLeft_X = topLeft_X;
        TopLeft_Y = topLeft_Y;
        BottomRight_X = bottomRight_X;
        BottomRight_Y = bottomRight_Y;
    }

    @Override
    public void moveUp() {
        TopLeft_X++;
        BottomRight_X++;
    }

    @Override
    public void moveDown() {
        TopLeft_X--;
        BottomRight_X--;
    }

    @Override
    public void moveLeft() {
        TopLeft_Y--;
        BottomRight_Y--;
    }

    @Override
    public void moveRight() {
        TopLeft_Y--;
        BottomRight_Y--;
    }

    @Override
    public String toString() {
        return "левая верхняя точка (" + TopLeft_X +
                ";" + TopLeft_Y + ")\n" +
                "правая нижняя точка (" + BottomRight_X +
                ";" + BottomRight_Y + ")";
    }
}
