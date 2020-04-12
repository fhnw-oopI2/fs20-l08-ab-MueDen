package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {
    private SimpleStringProperty title ;
    private SimpleStringProperty buttonText;
    public PresentationModel(){
        init();
    }
    private void init(){
        title = new SimpleStringProperty();
        buttonText = new SimpleStringProperty();
        title.set("JavaFx Application");
        buttonText.set("Hello World");
    }
    public SimpleStringProperty titleProperty() {
        return title;
    }

    public SimpleStringProperty buttonTextProperty() {
        return buttonText;
    }

}
