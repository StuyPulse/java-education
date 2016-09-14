package guiExamples;

import gui.GuiSimple;
import javafx.scene.paint.Color;

public class Stamper extends GuiSimple {
    public void setup() {
    }

    public void draw() {
        if (mouse.isPressed()) {
            screen.setColor(Color.GREEN);
            screen.circle(mouse.getX(), mouse.getY(), 15.0);
        } else {
            screen.setColor(Color.BLUE);
            screen.circle(mouse.getX(), mouse.getY(), 1.0);
        }
    }

    public static void main(String[] args) {
        begin(new Stamper());
    }
}
