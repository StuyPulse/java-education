import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;

public class BouncingClassy implements GuiSimple {
    private Ball _ball;

    public void setup(Draw screen) {
        _ball = new Ball(200.0, 50.0);
        _ball.setVx(2.0);
    }

    public void draw(Draw screen, Mouse mouse) {
        screen.clear();
        _ball.paint(screen);

        _ball.update();
    }

    public static void main(String[] args) {
        Master.begin(args, new BouncingClassy());
    }
}
