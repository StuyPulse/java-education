import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;

public class BouncingSimple implements GuiSimple {
    private double _ballHeight;
    private double _velocity;

    public void setup(Draw screen) {
        _ballHeight = 50.0;
        _velocity = 0.0;
    }

    public void draw(Draw screen, Mouse mouse) {
        screen.clear();
        screen.circle(200.0, _ballHeight, 10);

        if (_ballHeight > 400.0) {
            _velocity *= -1.0;
        } else {
            _velocity += 0.3;
        }

        _ballHeight += _velocity;
        System.out.println(_ballHeight + " " + _velocity);
    }

    public static void main(String[] args) {
        Master.begin(args, new BouncingSimple());
    }
}
