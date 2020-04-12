package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {
    private Button button;
    private StringProperty buttonText = new SimpleStringProperty();
    public ApplicationUI(PresentationModel pm) {
        //buttonText.bind(pm.buttonTextProperty());
        initCtr(pm);
        layoutCtr();

    }
    public void initCtr(PresentationModel pm){
       // button = new Button(buttonText.getValue());
        button = new Button();
        button.textProperty().bind(pm.buttonTextProperty());
    }
    public void layoutCtr(){
        getChildren().add(button);
    }
}
