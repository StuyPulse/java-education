package guiExamples;

import gui.GuiSimple;

public class BouncingXY extends GuiSimple {
    private double _x;
    private double _y;

    private double _vx;
    private double _vy;

    public void setup() {
        _x = 200.0;
        _y = 50.0;

        _vx = 2.0;
        _vy = 0.0;
    }

    public void draw() {
        screen.clear();
        screen.circle(_x, _y, 10.0);

        if (_y > 400.0) {
            _vy *= -1.0;
        } else {
            _vy += 0.3;
        }

        if (_x > 400.0 || _x < 0.0) {
            _vx *= -1.0;
        }

        _x += _vx;
        _y += _vy;
    }

    public static void main(String[] args) {
        begin(new BouncingXY());
    }
}
