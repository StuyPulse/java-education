import gui.Screen;
import gui.GuiSimple;

public class BouncingClassy extends GuiSimple {
    private Ball _ball0;
    private Ball _ball1;

    public void setup() {
        _ball0 = new Ball(200.0, 50.0);
        _ball0.setVx(2.0);

        _ball1 = new Ball(150.0, 70.0);
        _ball1.setVx(-2.5);
    }

    public void draw() {
        screen.clear();
        _ball0.paint(screen);
        _ball0.update();

        _ball1.paint(screen);
        _ball1.update();
    }

    public static void main(String[] args) {
        begin(new BouncingClassy());
    }
}

class Ball {
    private double _x;
    private double _y;

    private double _vx;
    private double _vy;

    public Ball(double initialX, double initialY) {
        _x = initialX;
        _y = initialY;
    }

    public void setVx(double newVx) {
        _vx = newVx;
    }

    public void paint(Screen screen) {
        screen.circle(_x, _y, 10.0);
    }

    public void update() {
        if (_y > 400.0) {
            _vy *= -1.0;
        } else {
            _vy += 0.3;
        }

        if (_x > 400.0 || _x < 0.0) {
            _vx *= -1;
        }

        _x += _vx;
        _y += _vy;
    }
}
