import gui.GuiSimple;
import gui.Master;

public class BouncingClassy extends GuiSimple {
    private Ball _ball0;
    private Ball _ball1;

    public void setup() {
        _ball0 = new Ball(200.0, 50.0);
        _ball0.setVx(2.0);

        _ball1 = new Ball (150.0, 70.0);
        _ball1.setVx(-2.5);
    }

    public void draw() {
        clear();
        _ball0.paint(this);
        _ball0.update();

        _ball1.paint(this);
        _ball1.update();
    }

    public static void main(String[] args) {
        Master.begin(args, new BouncingClassy());
    }
}
