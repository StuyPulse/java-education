package guiExamples;

import gui.GuiSimple;
import javafx.scene.paint.Color;

public class CursorFollow extends GuiSimple {
    public void setup() {
    }

    public void draw() {
        screen.clear();
        if (mouse.clicked()) {
            screen.setColor(Color.GREEN);
            screen.circle(mouse.getX() - 10.0, mouse.getY() - 10.0, 15);
        } else {
            screen.setColor(Color.BLUE);
            screen.circle(mouse.getX() - 10.0, mouse.getY() - 10.0, 10.0);
        }
    }

    public static void main(String[] args) {
        begin(new CursorFollow());
    }
}
