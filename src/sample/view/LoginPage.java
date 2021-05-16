package sample.view;

import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class LoginPage extends VBox {
    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginBTN;
    private Label errorLBL;

    public LoginPage(){
        Label usernameLBL=new Label("username :");
        usernameField=new TextField();
        HBox userRow=new HBox(usernameLBL, usernameField);
        userRow.setAlignment(Pos.CENTER);

        Label passwordLBL =new Label("password : ");
        passwordField=new PasswordField();
        HBox passwordRow=new HBox(passwordLBL, passwordField);
        passwordRow.setAlignment(Pos.CENTER);

        errorLBL=new Label();

        loginBTN=new Button("login");

        this.getChildren().addAll(userRow,passwordRow, loginBTN, errorLBL);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
    }


    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Button getLoginBTN() {
        return loginBTN;
    }

    public void setLoginBTN(Button loginBTN) {
        this.loginBTN = loginBTN;
    }

    public Label getErrorLBL() {
        return errorLBL;
    }

    public void setErrorLBL(Label errorLBL) {
        this.errorLBL = errorLBL;
    }
}
