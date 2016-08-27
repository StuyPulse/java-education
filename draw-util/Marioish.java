import gui.GuiSimple;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class Marioish extends GuiSimple {
    private double _x;
    private double _y;

    private double _vy;

    public void setup() {
        _x = 200.0;
        _y = 200.0;

        _vy = 0.0;
    }

    public void draw() {
        screen.clearWith(Color.SKYBLUE);
        screen.setColor(Color.GREEN);
        screen.rect(0.0, 360.0, 400.0, 40.0);
        screen.setColor(Color.RED);
        screen.circle(_x, _y, 10.0);

        if (_y < 350.0) {
            _vy += 0.3;
        }

        if (keyboard.isKeyPressed(KeyCode.A)) {
            _x -= 3.0;
        }
        if (keyboard.isKeyPressed(KeyCode.D)) {
            _x += 3.0;
        }
        if (_y > 349.0 && keyboard.isKeyPressed(KeyCode.W)) {
            _vy -= 10.0;
        }

        _y += _vy;

        if (_x < 10.0) {
            _x = 10.0;
        }
        if (_x > 390.0) {
            _x = 390.0;
        }
        if (_y > 350.0) {
            _y = 350.0;
            _vy = 0.0;
        }
    }

    public static void main(String[] args) {
        begin(new Marioish());
    }
}
