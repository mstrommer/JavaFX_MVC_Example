package at.ac.technikum.javafx_mvc_example;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

    private StringProperty value = new SimpleStringProperty("Initial Value");

    // Setter for value property
    public void setValue(String value) {
        this.value.set(value);
    }

    // Getter for value property (as StringProperty)
    public StringProperty valueProperty() {
        return value;
    }
}