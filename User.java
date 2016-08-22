import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;
import javafx.scene.paint.Color;

public class User implements GuiSimple {
    public void setup(Draw draw) {
    }

    public void draw(Draw draw, Mouse mouse) {
        draw.clear();
        if (mouse.clicked()) {
            draw.setColor(Color.GREEN);
            draw.circle(mouse.getX() - 10, mouse.getY() - 10, 15);
        } else {
            draw.setColor(Color.BLUE);
            draw.circle(mouse.getX() - 10, mouse.getY() - 10, 10);
        }
    }

    public static void main(String[] args) {
        Master.begin(args, new User());
    }
}
