package gui;

import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.application.Application;

public class MasterThready extends Application {
    private Canvas _canvas;

    private Draw _draw;
    private Mouse _mouse;

    private static GuiSimple runner;
    private Thread _animationThread;

    @Override
    public void start(Stage stage) {
        Platform.setImplicitExit(true);
        _mouse = new Mouse();
        _draw = new Draw(stage, _mouse, runner.getClass().getName());

        _animationThread = new Thread(new Runnable() {
                public void run() {
                    runner.setup(_draw);
                    try {
                        long lastFrame = 0;
                        while (true) {
                            _mouse.clicked = _mouse.lastClickTime > lastFrame;
                            runner.draw(_draw, _mouse);
                            lastFrame = System.currentTimeMillis();
                            Thread.sleep(16);
                        }
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted");
                    }
                }
            });
        _animationThread.start();
    }

    @Override
    public void stop() {
        _animationThread.interrupt();
    }

    public static void begin(String[] args, GuiSimple run) {
        runner = run;
        launch(args);
    }
}
