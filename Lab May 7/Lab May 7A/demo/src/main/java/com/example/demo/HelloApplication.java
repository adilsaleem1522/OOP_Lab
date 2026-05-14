package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

import static java.util.Collections.addAll;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        stage.setTitle("Welcome to javaFx");
        stage.setResizable(false);

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.setHgap(10);
        layout.setVgap(10);
        Label welcome = new Label("Welcome to Login");
        welcome.setFont(new Font("New Times Roman",36));
        Label UserName = new Label("User name");
        Label Password = new Label("Password");


        Button button = new Button("Submit");
        Button cancel = new Button("Cancel");

        HBox buttonBox = new HBox();

        layout.add(welcome,0,0,2,1);
        //layout.add(welcome,0,0);
        layout.add(UserName,0,1);
        layout.add(Password,0,2);

        TextField userTextField = new TextField();
        PasswordField passwordField = new PasswordField();

        layout.add(userTextField,1,1);
        layout.add(passwordField,1,2);
        buttonBox.setAlignment(Pos.BASELINE_RIGHT);

        Label alert=new Label();
        layout.add(alert,1,4);
        buttonBox.setSpacing(10);

        layout.add(buttonBox,1,3);
        cancel.setOnAction(e-> System.exit(0));
        Button loginButton = new Button("Login");
        buttonBox.getChildren().addAll(loginButton,cancel);

        loginButton.setOnAction(e->{
            if (userTextField.getText().equals("Admin")) {
                stage.setScene(createScene2());
            }
        }
        );

        Scene scene1 = new Scene(layout, 500, 400);
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public static Scene createScene2(){
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20,20,20,20));

        TextField name = new TextField();
        name.setPromptText("Enter Name");
        RadioButton maleRadioButton = new RadioButton("Male");
        RadioButton femaleRadioButton = new RadioButton("Female");
        ToggleGroup toggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadioButton.setToggleGroup(toggleGroup);

        VBox genderBox = new VBox();
        genderBox.getChildren().addAll(maleRadioButton,femaleRadioButton);

        Slider height=new Slider();
        height.setShowTickMarks(true);
        height.setShowTickLabels(true);
        Label heightLabel = new Label();
        gridPane.add(heightLabel,1,2);
        height.valueProperty().addListener(e-> System.out.println(height.getValue()));

        gridPane.add(name,0,0);
        gridPane.add(genderBox,0,1);
        gridPane.add(height,0,2);
        gridPane.setVgap(20);

        DatePicker dob=new DatePicker();

        gridPane.add(dob,0,4);
        gridPane.setVgap(20);

        Scene scene2 = new Scene(gridPane,500,400);
        return scene2;

    }
}

