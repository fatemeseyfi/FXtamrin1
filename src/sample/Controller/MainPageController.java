package sample.Controller;
import javafx.application.Platform;
import sample.model.Student;
import sample.view.MainPage;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class MainPageController {
    private MainPage mainPage;

    MainPageController(){

        setMainPage(new MainPage());

        mainPage.getAddBTN().setOnAction(event -> {//action for addButton
            //to show an addStudentPage
            AddStudentController addStudentController=new AddStudentController(this);

            Stage addStudentStage=new Stage();
            addStudentStage.setScene(new Scene(addStudentController.getAddStudentPage()));
            addStudentStage.show();
        });

        mainPage.getRemoveBTN().setOnAction(event -> {
            Student selectedStudent=mainPage.getTableView().getSelectionModel().getSelectedItem();
            if(selectedStudent!=null){
                mainPage.getTableView().getItems().remove(selectedStudent);
            }
        });

        mainPage.getExitBTN().setOnAction(event -> {
            Platform.exit();
        });
    }

    public void addStudentToTable(Student student){
        //to add created students to tableView
        mainPage.getTableView().getItems().add(student);
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }
}
