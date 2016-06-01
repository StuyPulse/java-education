import gui.GuiSimple;
import gui.Draw;
import gui.Mouse;
import gui.Master;

public class BouncingClassy implements GuiSimple {
    private Ball ball;

    public void setup(Draw screen) {
        ball = new Ball(200.0, 50.0);
        ball.setVx(2.0);
    }

    public void draw(Draw screen, Mouse mouse) {
        screen.clear();
        ball.paint(screen);

        ball.update();
    }

    public static void main(String[] args) {
        Master.begin(args, new BouncingClassy());
    }
}
