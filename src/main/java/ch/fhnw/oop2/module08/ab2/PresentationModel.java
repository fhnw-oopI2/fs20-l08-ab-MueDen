package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.layout.StackPane;

public class PresentationModel {
    private SimpleStringProperty title ;
    private SimpleStringProperty buttonText;
    public PresentationModel(){
        init();
    }
    private void init(){
        title = new SimpleStringProperty();
        buttonText = new SimpleStringProperty();
        title.set("Toggle Application");
        buttonText.set(State.OFF.toString());
    }
    public SimpleStringProperty titleProperty() {
        return title;
    }

    public SimpleStringProperty buttonTextProperty() {
        return buttonText;
    }

    public SimpleStringProperty toggle(){
        if(buttonText.getValue().equals(State.OFF.toString())){
            buttonText.set(State.ON.toString());
        } else {
            buttonText.set(State.OFF.toString());
        }
        return null;
    }

}
