package user.org.personal_expense_tracker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.setHgap(10);
        layout.setVgap(10);

        Scene scene = new Scene(layout, 500, 500);
        stage.setTitle("Personal Expense Tracker");
        Label welcome = new Label("Welcome to Login");
        welcome.setFont(new Font("Times New Roman",36));

        TextField textField = new TextField();
        textField.setPromptText("Enter Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Your Password");
        Label userName = new Label("User Name");
        Label password = new Label("Password");
        Button login = new Button("Login");
        Button exit = new Button("Exit");
        Button reset = new Button("Reset Password");
        Button registerUser = new Button("Register as new user");
        Label alert=new Label();

        HBox buttonBox = new HBox();
        buttonBox.setAlignment(Pos.BASELINE_RIGHT);
        buttonBox.setSpacing(10);
        buttonBox.getChildren().addAll(login,reset,exit);

        layout.add(welcome,0,0,2,1);
        layout.add(userName,0,1);
        layout.add(password,0,2);
        layout.add(textField,1,1);
        layout.add(passwordField,1,2);
        layout.add(buttonBox,1,3);
        layout.add(registerUser,1,4);
        layout.add(alert,1,5);

        exit.setOnAction(e-> System.exit(0));
        reset.setOnAction(e -> stage.setScene(createScene3(stage)));
        registerUser.setOnAction(e->stage.setScene(createScene4(stage)));
        login.setOnAction(e -> {
            String inputUser = textField.getText();
            String inputPass = passwordField.getText();
            boolean found = false;

            for (UserData userData : Credentials.users) {
                if (userData.name.equals(inputUser) && userData.password.equals(inputPass)) {
                    Credentials.currentUser = userData;
                    stage.setScene(createScene2(stage));
                    found = true;
                    break;
                }
            }
            if (!found) {
                alert.setText("The Username or Password is Incorrect");
                alert.setTextFill(Paint.valueOf("Red"));
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public Scene createScene2(Stage stage) {
        GridPane layout2 = new GridPane();
        layout2.setPadding(new Insets(20,20,20,20));
        layout2.setAlignment(Pos.BASELINE_LEFT);
        layout2.setVgap(10);
        layout2.setHgap(10);

        Label dashBoard = new Label("Expense Dashboard");
        dashBoard.setFont(new Font("Times New Roman",30));
        dashBoard.setTextFill(Paint.valueOf("Grey"));
        Label welcomeLabel = new Label("Welcome Back Mr " + Credentials.currentUser.name + "!");
        welcomeLabel.setFont(new Font("Times New Roman", 25));
        Label incomeLabel = new Label("Your Income = " + Credentials.currentUser.income);
        Label expenseLabel = new Label("Your Expenses Till Now = " + Credentials.currentUser.expense);
        Label remaining = new Label("Remaining Amount =  " + (Credentials.currentUser.income - Credentials.currentUser.expense));
        Label transaction = new Label("Enter your transaction below = ");
        Label alert2 = new Label();
        TextField transactionInput = new TextField();
        transactionInput.setPromptText("Enter amount");
        Button incomeAmount = new Button("Enter Income");
        Button expenseAmount = new Button("Enter Expense");
        Button cancel = new Button("Exit");
        Button logout = new Button("Logout");

        HBox buttonBox5 = new HBox();
        buttonBox5.setAlignment(Pos.BASELINE_LEFT);
        buttonBox5.setSpacing(10);
        buttonBox5.getChildren().addAll(incomeAmount,expenseAmount);

        HBox buttonBox2 = new HBox();
        buttonBox2.setAlignment(Pos.BASELINE_LEFT);
        buttonBox2.setSpacing(10);
        buttonBox2.getChildren().addAll(logout,cancel);

        cancel.setOnAction(event -> System.exit(0));
        logout.setOnAction(e -> start(stage));
        incomeAmount.setOnAction(e->{
            try {
            int newAmount = Integer.parseInt(transactionInput.getText());
            Credentials.currentUser.income += newAmount;
            incomeLabel.setText("Your income = " + Credentials.currentUser.income);
            remaining.setText("Remaining Amount =  " + (Credentials.currentUser.income-Credentials.currentUser.expense));
            transactionInput.clear();

        } catch (Exception ex) {
            alert2.setText("Invalid Input! Please Enter a real value.");
            alert2.setTextFill(Paint.valueOf("Red"));
        }
        });

        expenseAmount.setOnAction(e-> {
            try {
                int newAmount = Integer.parseInt(transactionInput.getText());
                Credentials.currentUser.expense += newAmount;
                int remainingAmount = Credentials.currentUser.income - Credentials.currentUser.expense;
                remaining.setText("Remaining Amount: " + remainingAmount);
                expenseLabel.setText("Total Expenses: " + Credentials.currentUser.expense);
                transactionInput.clear();
                if (remainingAmount <= 0){
                    alert2.setText("Your expenses have exceeded from your income.");
                    alert2.setTextFill(Paint.valueOf("Red"));
                    remaining.setTextFill(Paint.valueOf("Red"));
                }
            } catch (Exception ex) {
                alert2.setText("Invalid Input! Please Enter a real value.");
                alert2.setTextFill(Paint.valueOf("Red"));
            }
        });
        layout2.add(dashBoard,0,0);
        layout2.add(welcomeLabel, 0, 1);
        layout2.add(incomeLabel,0,2);
        layout2.add(expenseLabel,0,3);
        layout2.add(remaining,0,4);
        layout2.add(transaction,0,5);
        layout2.add(transactionInput,0,6);
        layout2.add(buttonBox5,0,7);
        layout2.add(buttonBox2, 0, 8);
        layout2.add(alert2,0,9);

        return new Scene(layout2,500,500);
    }

    public Scene createScene3(Stage stage) {
        GridPane layout3 = new GridPane();
        layout3.setPadding(new Insets(20,20,20,20));
        layout3.setHgap(10);
        layout3.setVgap(10);
        layout3.setAlignment(Pos.BASELINE_LEFT);

        Label title = new Label("Reset Password");
        title.setFont(new Font("Times New Roman", 30));

        TextField textField2 = new TextField();
        textField2.setPromptText("Enter Username");
        Label userName = new Label("Username");
        Label newPassword = new Label("New Password");

        PasswordField passwordField2 = new PasswordField();
        passwordField2.setPromptText("Enter New Password");
        Button updateButton = new Button("Update Password");
        Button backButton = new Button("Back to Login");
        Label alert3 = new Label();

        HBox buttonBox3 = new HBox();

        buttonBox3.setAlignment(Pos.BASELINE_LEFT);
        buttonBox3.setSpacing(10);
        buttonBox3.getChildren().addAll(updateButton,backButton);

        layout3.add(title, 0, 0, 2, 1);
        layout3.add(userName, 0, 1);
        layout3.add(newPassword, 0, 2);
        layout3.add(textField2, 1, 1);
        layout3.add(passwordField2, 1, 2);
        layout3.add(buttonBox3, 1, 3);
        layout3.add(alert3, 1, 4);

        backButton.setOnAction(e -> start(stage));
        updateButton.setOnAction(e -> {
            String oldUserName = textField2.getText();
            String newPass = passwordField2.getText();
            boolean userFound = false;

            for (UserData u : Credentials.users) {
                if (u.name.equals(oldUserName)) {
                    u.password = newPass;
                    alert3.setText("Password updated Successfully");
                    alert3.setTextFill(Paint.valueOf("Green"));
                    userFound = true;
                    break;
                }
            }
            if (!userFound) {
                alert3.setText("User not found!");
                alert3.setTextFill(Paint.valueOf("Red"));
            }
        });
        return new Scene(layout3,500,500);
    }
    public Scene createScene4(Stage stage) {
        GridPane layout4 = new GridPane();
        layout4.setPadding(new Insets(20, 20, 20, 20));
        layout4.setHgap(10);
        layout4.setVgap(10);
        layout4.setAlignment(Pos.BASELINE_LEFT);

        Label title = new Label("Register new user");
        title.setFont(new Font("Times New Roman", 30));

        Label registerName = new Label("Enter Username");
        Label registerPassword = new Label("New Password");
        Label registerIncome = new Label("Enter Income");

        TextField userText = new TextField();
        userText.setPromptText("Enter Username");
        PasswordField userPassword = new PasswordField();
        userPassword.setPromptText("Enter Password");
        TextField userIncome = new TextField();
        userIncome.setPromptText("Enter Your Income");

        Button registerButton = new Button("Register");
        Button login2 = new Button("Login Page");
        Label alert4 = new Label();

        HBox buttonBox4 = new HBox();
        buttonBox4.setAlignment(Pos.BASELINE_RIGHT);
        buttonBox4.setSpacing(10);
        buttonBox4.getChildren().addAll(registerButton,login2);

        layout4.add(title,0,0,2,1);
        layout4.add(registerName,0,1);
        layout4.add(registerIncome,0,2);
        layout4.add(registerPassword, 0, 3);
        layout4.add(userText, 1, 1);
        layout4.add(userIncome, 1, 2);
        layout4.add(userPassword, 1, 3);
        layout4.add(buttonBox4, 1, 4);
        layout4.add(alert4, 1, 5);

        login2.setOnAction(e -> start(stage));
        registerButton.setOnAction(e ->{
            try {
                String name = userText.getText();
                String password = userPassword.getText();
                int income = Integer.parseInt(userIncome.getText());
                Credentials.users.add(new UserData(name, password, income, 0));
                alert4.setText("Registration Successful!");
                alert4.setTextFill(Paint.valueOf("Green"));
            }
            catch (Exception ex) {
                alert4.setText("Invalid Income amount!");
                alert4.setTextFill(Paint.valueOf("Red"));
            }
        } );
        return new Scene(layout4,500,500);
    }
    public static void main(String[] args) {
        launch();
    }
}

