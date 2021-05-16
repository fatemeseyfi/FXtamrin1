package sample.Controller;

import javafx.scene.paint.Color;
import sample.model.Student;
import sample.view.AddStudentPage;
import javafx.scene.control.TableView;


public class AddStudentController {
    private AddStudentPage addStudentPage;
    MainPageController mainPageController;//??

    public AddStudentController(MainPageController mainPageController){ //??
        addStudentPage = new AddStudentPage();

        this.mainPageController=mainPageController;//??

        addStudentPage.getAddBTN().setOnAction(event -> { //action for addButton
                String newName = addStudentPage.getNameField().getText();
                String newLastName = addStudentPage.getLastNameField().getText();
                String newId = addStudentPage.getIDField().getText();

                Student student = new Student(newName ,newLastName, newId);

                mainPageController.addStudentToTable(student);

        });





    }

    public AddStudentPage getAddStudentPage() {
        return addStudentPage;
    }
}
