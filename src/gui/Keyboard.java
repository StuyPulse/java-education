package gui;

import java.util.HashMap;
import javafx.scene.input.KeyCode;

public class Keyboard {
    private HashMap<KeyCode, Boolean> keys;

    public Keyboard() {
        keys = new HashMap<KeyCode, Boolean>();
    }

    void setKeyPressed(KeyCode key, boolean pressed) {
        keys.put(key, pressed);
    }

    public boolean isKeyPressed(KeyCode key) {
        return keys.containsKey(key) && keys.get(key);
    }
}
