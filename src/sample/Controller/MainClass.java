package sample.Controller;
import sample.model.Admin;
        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.stage.Stage;


public class MainClass extends Application{


    public static Admin admin=new Admin("fateme","1234");

    public static void main(String[] args){ launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {

        LoginPageController loginPageController=new LoginPageController();
        primaryStage.setScene(new Scene(loginPageController.getLoginPage()));
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
    }


}
