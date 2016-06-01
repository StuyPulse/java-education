import gui.Draw;

// For use with BouncingClassy

public class Ball {
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

    public void paint(Draw screen) {
        screen.circle(_x, _y, 10);
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
