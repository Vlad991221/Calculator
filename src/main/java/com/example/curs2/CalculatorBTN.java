package com.example.curs2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorBTN extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField nr1TextField = new TextField();
        TextField nr2TextField = new TextField();
        Label nr1Label = new Label("Introduceti o valoare");
        Label nr2Label = new Label("Introduceti o valoare");
        HBox nr1HBox = new HBox(nr1Label, nr1TextField);
        HBox nr2Hbox = new HBox(nr2Label, nr2TextField);

        Button btnSubmit = new Button("Calculeaza suma a doua nr intregi");
        btnSubmit.setWrapText(true);
        btnSubmit.setDefaultButton(true);
        btnSubmit.setFont(Font.font("Arial", 40));

        Button btnCancel = new Button("Cancel");
        btnCancel.setCancelButton(true);
        btnCancel.setFont(Font.font("Arial", 30));

        Button btnReset = new Button("Reset");
        btnReset.setFont(Font.font("Arial", 30));

        Label rezultatLabel = new Label();

        HBox btnHbox = new HBox(btnSubmit, btnReset, btnCancel);

        btnSubmit.setOnAction(actionEvent -> {
            String nr1 = nr1TextField.getText();
            String nr2= nr2TextField.getText();

            if (nr1.isEmpty() || nr2.isEmpty()) {
                rezultatLabel.setText("Introduceti ambele numere");
                rezultatLabel.setTextFill(Color.RED);
                return;
            }

            Integer val1 = Integer.parseInt(nr1);
            Integer val2 = Integer.parseInt(nr2);
            Integer sum = val1 + val2;
            rezultatLabel.setText(sum.toString());
        });

        btnCancel.setOnAction(actionEvent -> {
            System.exit(1);
        });

        btnReset.setOnAction(actionEvent -> {
            nr1TextField.clear();
            nr2TextField.clear();
            rezultatLabel.setText("");
        });

        VBox vBox = new VBox(nr1HBox, nr2Hbox, btnHbox, rezultatLabel);
        Scene scene = new Scene(vBox, 500, 300);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
