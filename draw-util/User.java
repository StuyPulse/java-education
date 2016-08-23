import gui.GuiSimple;
import gui.Master;
import javafx.scene.paint.Color;

public class User extends GuiSimple {
    public void setup() {
    }

    public void draw() {
        clear();
        if (clicked()) {
            setColor(Color.GREEN);
            circle(getMouseX() - 10, getMouseY() - 10, 15);
        } else {
            setColor(Color.BLUE);
            circle(getMouseX() - 10, getMouseY() - 10, 10);
        }
    }

    public static void main(String[] args) {
        Master.begin(args, new User());
    }
}
