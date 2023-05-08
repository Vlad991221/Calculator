package com.example.curs2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CalculatorMeniu extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        TextField nr1Text = new TextField();
        TextField nr2Text = new TextField();
        Button submit = new Button("Calculeaza");

        MenuItem plus = new MenuItem("Plus");
        MenuItem minus = new MenuItem("Minus");
        MenuItem inmultire = new MenuItem("Inmultire");
        MenuItem impartire = new MenuItem("Impartire");

        MenuButton operatii = new MenuButton("Operatie", null, plus, minus, inmultire, impartire);

        Label rezultatLabel = new Label();
        Label operatieEfectuata = new Label();
        plus.setOnAction(actionEvent -> {
            operatieEfectuata.setText("+");
        });

        minus.setOnAction(actionEvent -> {
            operatieEfectuata.setText("-");
        });

        inmultire.setOnAction(actionEvent -> {
            operatieEfectuata.setText("*");
        });

        impartire.setOnAction(actionEvent -> {
            operatieEfectuata.setText("/");
        });

        submit.setOnAction(actionEvent -> {
            String nr1Value = nr1Text.getText();
            String nr2Value = nr2Text.getText();
            if (nr1Value.isEmpty() || nr2Value.isEmpty()) {
                rezultatLabel.setText("Va rugam introduceti cele doua numere");
                rezultatLabel.setTextFill(Color.RED);
                return;
            }

            Double rezultat = 0d;

            switch (operatieEfectuata.getText()){
                case "+":
                    rezultat = Double.parseDouble(nr1Value) + Double.parseDouble(nr2Value);
                    break;
                case "-":
                    rezultat = Double.parseDouble(nr1Value) - Double.parseDouble(nr2Value);
                    break;
                case "*":
                    rezultat = Double.parseDouble(nr1Value) * Double.parseDouble(nr2Value);
                    break;
                case "/":
                    rezultat = Double.parseDouble(nr1Value) / Double.parseDouble(nr2Value);
                    break;
            }
            rezultatLabel.setText(nr1Value + " " + operatieEfectuata.getText() + " " + nr2Value + " = " + rezultat);
        });

        VBox vBox = new VBox(operatii, nr1Text, nr2Text, submit, rezultatLabel);
        Scene scene = new Scene(vBox, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
