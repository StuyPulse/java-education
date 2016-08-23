import gui.GuiSimple;
import gui.Master;

public class BouncingSimple_TooHigh extends GuiSimple {
    private double _ballHeight;
    private double _velocity;

    public void setup() {
        _ballHeight = 50.0;
        _velocity = 0.0;
    }

    public void draw() {
        clear();
        circle(200.0, _ballHeight, 10);

        if (_ballHeight > 400.0) {
            _velocity *= -1.0;
        }

        _ballHeight += _velocity;
        _velocity += 0.3;
        System.out.println(_ballHeight + " " + _velocity);
    }

    public static void main(String[] args) {
        Master.begin(args, new BouncingSimple_TooHigh());
    }
}
