package sample;

import javafx.scene.control.TextField;

public class Controller {
    public TextField nameField;

    public void onButtonClicked() {
        System.out.println("Hello, " + nameField.getText());
    }
}
