import gui.GuiSimple;
import gui.Master;
import javafx.scene.paint.Color;

public class Stamp extends GuiSimple {
    public void setup() {
    }

    public void draw() {
        if (mousePressed()) {
            setColor(Color.GREEN);
            circle(getMouseX(), getMouseY(), 15.0);
        } else {
            setColor(Color.BLUE);
            circle(getMouseX(), getMouseY(), 1.0);
        }
    }

    public static void main(String[] args) {
        Master.begin(args, new Stamp());
    }
}
