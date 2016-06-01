import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;

public class FallingSimple implements GuiSimple {
    private double ballHeight;
    private double velocity;

    public void setup(Draw screen) {
        ballHeight = 0.0;
        velocity = 0.0;
    }

    public void draw(Draw screen, Mouse mouse) {
        screen.clear();
        screen.circle(200.0, ballHeight, 10);

        ballHeight += velocity;
        velocity += 1.0;
    }

    public static void main(String[] args) {
        Master.begin(args, new FallingSimple());
    }
}
