package Java_Course.app;

import Java_Course.app.database.DataBaseConnection;
import Java_Course.app.view.AccountView;

public class AppRun {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        AccountView accountView = new AccountView();
    }
}
