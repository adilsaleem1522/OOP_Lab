package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        GridPane layout = new GridPane();
        stage.setTitle("Bill Calculator");
        stage.setResizable(false);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.setHgap(10);
        layout.setVgap(15);

        Label cal = new Label("Bill Calculator");
        cal.setFont(new Font("Times New Roman", 30));
        layout.add(cal, 0, 0, 2, 1);

        Label prevLabel = new Label("Previous Reading:");
        Label currLabel = new Label("Current Reading:");
        TextField prevTextField = new TextField();
        TextField currTextField = new TextField();
        layout.add(prevLabel, 0, 1);
        layout.add(currLabel, 0, 2);
        layout.add(prevTextField, 1, 1);
        layout.add(currTextField, 1, 2);

        Button button = new Button("Calculate");
        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().add(button);
        layout.add(buttonBox, 1, 3);

        Label totalBill = new Label();
        Label totalTextField = new Label();
        layout.add(totalBill, 0, 4);
        layout.add(totalTextField, 1, 4);

        button.setOnAction(e->{
            try {
                double previous = Double.parseDouble(prevTextField.getText());
                double current = Double.parseDouble(currTextField.getText());

                if (current >= previous) {
                    double units = current - previous;
                    double total = units * 50;
                    totalBill.setText("Total Bill: " + total);
                }
            } catch (Exception ex) {
                totalTextField.setText("Enter Numbers Only");
            }

        });
        Scene scene1 = new Scene(layout, 450, 450);
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
