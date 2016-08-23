package gui;

import javafx.scene.paint.Color;

public abstract class GuiSimple {
    abstract public void setup();
    abstract public void draw();

    Draw _draw;
    Mouse _mouse;

    // drawing methods
    public void setColor(Color color) {
        _draw.setColor(color);
    }

    public void clearWith(Color color) {
        _draw.clearWith(color);
    }

    public void clear() {
        _draw.clear();
    }

    public void circle(double x, double y, double radius) {
        _draw.circle(x, y, radius);
    }

    public void ellipse(double x, double y, double width, double height) {
        _draw.ellipse(x, y, width, height);
    }

    public void rect(double x, double y, double width, double height) {
        _draw.rect(x, y, width, height);
    }

    public double windowHeight() {
        return _draw.height();
    }

    public double windowWidth() {
        return _draw.width();
    }

    // mouse methods
    public double getMouseX() {
        return _mouse.getX();
    }
    public double getMouseY() {
        return _mouse.getY();
    }
    public boolean mousePressed() {
        return _mouse.isPressed();
    }
    public boolean clicked() {
        return _mouse.clicked();
    }
}
