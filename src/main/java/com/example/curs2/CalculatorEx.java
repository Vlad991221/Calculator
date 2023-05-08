package com.example.curs2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CalculatorEx extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField noToConvert = new TextField();
        Button submit = new Button("Calculeaza");
        Label rezultat = new Label();
        submit.setDefaultButton(true);
        noToConvert.setMaxWidth(100);
        submit.setOnAction(actionEvent -> {
            String nr = noToConvert.getText();
            if (nr.isEmpty()){
                rezultat.setText("Va rugam introduceti o valoare");
                rezultat.setTextFill(Color.RED);
                return;
            }
            Double rezultatConversie = Double.parseDouble(nr) / 5d;
            rezultat.setText(rezultatConversie + " EUR");
        });

        VBox mainVbox = new VBox(noToConvert, submit, rezultat);
        Scene scene = new Scene(mainVbox, 300, 200);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
