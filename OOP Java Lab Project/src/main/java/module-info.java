module user.org.personal_expense_tracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens user.org.personal_expense_tracker to javafx.fxml;
    exports user.org.personal_expense_tracker;
}