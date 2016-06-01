package gui;

import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Draw {
    private Canvas _canvas;
    private GraphicsContext _ctx;

    private double _width;
    private double _height;

    public Draw(Stage stage, Mouse mouse, String title) {
        Pane root = new Pane();

        _width = 400.0;
        _height = 400.0;
        _canvas = new Canvas(_width, _height);
        _ctx = _canvas.getGraphicsContext2D();
        root.getChildren().add(_canvas);

        Scene s = new Scene(root, _width, _height, Color.WHITE);

        stage.setTitle(title);
        stage.setScene(s);
        stage.show();
        root.setOnMouseMoved(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    mouse.x = event.getSceneX();
                    mouse.y = event.getSceneY();
                }
            });
        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    mouse.lastClickTime = System.currentTimeMillis();
                }
            });
    }

    public void setColor(Color color) {
        _ctx.setFill(color);
    }

    public void clearWith(Color color) {
        _ctx.save();
        setColor(color);
        rect(0, 0, _width, _height);
        _ctx.restore();
    }

    public void clear() {
        clearWith(Color.WHITE);
    }

    public void circle(double x, double y, double radius) {
        ellipse(x, y, radius * 2, radius * 2);
    }

    public void ellipse(double x, double y, double width, double height) {
        _ctx.fillOval(x - width / 2, y - height / 2, width, height);
    }

    public void rect(double x, double y, double width, double height) {
        _ctx.fillRect(x, y, width, height);
    }

    public double height() {
        return _height;
    }

    public double width() {
        return _width;
    }
}
