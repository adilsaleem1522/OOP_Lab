package user.org.personal_expense_tracker;

public class UserData {
    String name;
    String password;
    int income;
    int expense;

    public UserData(String name, String password, int income, int expense) {
        this.name = name;
        this.password = password;
        this.income = income;
        this.expense = expense;
    }
}
