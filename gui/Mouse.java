package gui;

public class Mouse {
    double x;
    double y;
    boolean down;
    long lastClickTime;
    boolean clicked;

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public boolean isPressed() {
        return down;
    }
    public boolean clicked() {
        return clicked;
    }
}
