package at.ac.technikum.javafx_mvc_example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloMVCController {
    @FXML
    private Label label;

    private Model model;

    public void initialize() {
        // Initialize the model
        model = new Model();

        // Bind the label text property to the model's value property
        label.textProperty().bind(model.valueProperty());
    }

    @FXML
    private void changeValue() {
        // Update the value in the model
        // or execute some business logic here
        model.setValue("New Value");
    }
}