import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;

public class FallingSimple implements GuiSimple {
    private double _ballHeight;
    private double _velocity;

    public void setup(Draw screen) {
        _ballHeight = 0.0;
        _velocity = 0.0;
    }

    public void draw(Draw screen, Mouse mouse) {
        screen.clear();
        screen.circle(200.0, _ballHeight, 10);

        _ballHeight += _velocity;
        _velocity += 1.0;
    }

    public static void main(String[] args) {
        Master.begin(args, new FallingSimple());
    }
}