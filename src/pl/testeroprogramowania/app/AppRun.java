package pl.testeroprogramowania.app;

import pl.testeroprogramowania.app.database.DataBaseConnection;
import pl.testeroprogramowania.app.view.AccountView;

public class AppRun {
    public static void main(String[] args) {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        AccountView accountView = new AccountView();
    }
}
