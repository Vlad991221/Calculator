package com.example.curs2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label label = new Label("Introduceti un user");
        label.setFont(Font.font("Arial", 30));
        label.setTextFill(Color.RED);
        TextField textField = new TextField();
        textField.setText("Hello world!");
        HBox hBox = new HBox(label, textField);
        Label numeLabel = new Label("Introduceti un nume");
        numeLabel.setFont(Font.font("Arial", 30));
        numeLabel.setTextFill(Color.RED);
        TextField numeTextField = new TextField();
        HBox numeHBox = new HBox(numeLabel, numeTextField);

        VBox numeVBox = new VBox(hBox, numeHBox);
        Scene scene = new Scene(numeVBox, 500, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}