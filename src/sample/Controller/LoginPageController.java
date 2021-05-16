package sample.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import sample.view.LoginPage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class LoginPageController {

    private LoginPage loginPage;

    public LoginPageController(){

        loginPage=new LoginPage();

        loginPage.getLoginBTN().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(MainClass.admin.getUsername().equals(getLoginPage().getUsernameField().getText())
                        &&MainClass.admin.getPassword().equals(getLoginPage().getPasswordField().getText())) {

                    loginPage.getScene().getWindow().hide();

                    Stage mainPageStage=new Stage();

                    MainPageController mainPageController=new MainPageController();

                    mainPageStage.setScene(new Scene(mainPageController.getMainPage()));
                    mainPageStage.setWidth(1000);
                    mainPageStage.setHeight(500);
                    mainPageStage.show();

                }else {
                    loginPage.getErrorLBL().setTextFill(Color.RED);
                    loginPage.getErrorLBL().setText(" un valid");
                }
            }
        });
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }
}
