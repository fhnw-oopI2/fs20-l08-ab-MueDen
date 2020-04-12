package ch.fhnw.oop2.module08.ab2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    private StringProperty title = new SimpleStringProperty();
    @Override
    public void start(Stage primaryStage) {
        PresentationModel pm = new PresentationModel();
        Parent rootPanel = new ApplicationUI(pm);
        Scene scene = new Scene(rootPanel);

        title.bind(pm.titleProperty());

        primaryStage.setTitle(title.getValue());
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {Application.launch(args);}
}
