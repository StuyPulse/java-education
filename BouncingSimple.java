import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;

public class BouncingSimple implements GuiSimple {
    private double ballHeight;
    private double velocity;

    public void setup(Draw screen) {
        ballHeight = 50.0;
        velocity = 0.0;
    }

    public void draw(Draw screen, Mouse mouse) {
        screen.clear();
        screen.circle(200.0, ballHeight, 10);

        if (ballHeight > 400.0) {
            velocity *= -1.0;
        } else {
            velocity += 0.3;
        }

        ballHeight += velocity;
        System.out.println(ballHeight + " " + velocity);
    }

    public static void main(String[] args) {
        Master.begin(args, new BouncingSimple());
    }
}
