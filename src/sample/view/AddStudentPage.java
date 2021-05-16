package sample.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddStudentPage extends VBox {
    private TextField nameField;
    private TextField lastNameField;
    private TextField IDField;
    private Button addBTN;
    private Label errorLBL;

    public AddStudentPage(){
        //creating fields
        Label nameLBL=new Label("Name :");
        nameField=new TextField();

        Label lastNameLBL=new Label("lastName :");
        lastNameField=new TextField();

        Label IDLBL=new Label("ID :");
        IDField=new TextField();

        VBox lbls=new VBox(nameLBL,lastNameLBL,IDLBL);
        lbls.setAlignment(Pos.CENTER_LEFT);
        lbls.setSpacing(5);

        VBox fields=new VBox(nameField,lastNameField,IDField);
        fields.setAlignment(Pos.CENTER);

        HBox hBox=new HBox(lbls,fields);
        hBox.setAlignment(Pos.CENTER);

        addBTN=new Button("add Student");
        addBTN.setAlignment(Pos.CENTER);

        errorLBL=new Label();

        this.getChildren().addAll(hBox,addBTN,errorLBL);
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);


    }

    public TextField getNameField() {
        return nameField;
    }

    public void setNameField(TextField nameField) {
        this.nameField = nameField;
    }

    public TextField getIDField() {
        return IDField;
    }

    public void setIDField(TextField IDField) {
        this.IDField = IDField;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public Label getErrorLBL() {
        return errorLBL;
    }

    public void setErrorLBL(Label errorLBL) {
        this.errorLBL = errorLBL;
    }
}
