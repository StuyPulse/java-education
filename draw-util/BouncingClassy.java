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
