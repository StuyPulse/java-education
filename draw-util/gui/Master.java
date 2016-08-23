package gui;

import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.application.Application;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Master extends Application {
    private Canvas _canvas;

    private static GuiSimple runner;
    private Timeline _timeline;

    @Override
    public void start(Stage stage) {
        Platform.setImplicitExit(true);
        runner._mouse = new Mouse();
        runner._draw = new Draw(stage, runner._mouse, runner.getClass().getName());

        _timeline = new Timeline();
        _timeline.setCycleCount(Timeline.INDEFINITE);
        KeyFrame tick = new KeyFrame(
            Duration.seconds(0.016),
            new EventHandler<ActionEvent>() {
                private long lastFrame = 0;

                @Override
                public void handle(ActionEvent ae) {
                    runner._mouse.clicked = runner._mouse.lastClickTime > lastFrame;
                    runner.draw();
                    lastFrame = System.currentTimeMillis();
                }
            });
        _timeline.getKeyFrames().add(tick);

        runner.setup();

        _timeline.play();
    }

    @Override
    public void stop() {
        _timeline.stop();
    }

    public static void begin(String[] args, GuiSimple run) {
        runner = run;
        launch(args);
    }
}
