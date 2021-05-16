package sample.view;

import sample.model.Student;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
public class MainPage extends BorderPane{
    private TableView<Student> tableView;
    private Button addBTN;
    private Button removeBTN;
    private Button exitBTN;



    public MainPage() {

        setTableView(new TableView<>());//create table

        setAddBTN(new Button("add student"));//creat buttons
        setRemoveBTN(new Button("remove student"));
        setExitBTN(new Button("exit student"));
        addBTN.setMaxWidth(Double.MAX_VALUE);//اندازه کردن باتن ها
        removeBTN.setMaxWidth(Double.MAX_VALUE);
        exitBTN.setMaxWidth(Double.MAX_VALUE);

        TableColumn<Student,String> nameCLM=new TableColumn<>("Name");//ساختن کلومن ها
        TableColumn<Student,String> lastnameCLM=new TableColumn<>("LastName");
        TableColumn<Student,String> studentIDCLM=new TableColumn<>("StdentID");

        nameCLM.setCellValueFactory(new PropertyValueFactory<>("name"));//هر کلومن را به یک استرینگ خاص از استیودنت نسبت میدهد
        //lastnameCLM.setCellValueFactory(cellData ->  cellData.getValue().setName();
        lastnameCLM.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        studentIDCLM.setCellValueFactory(new PropertyValueFactory<>("sudentID"));


        getTableView().getColumns().addAll(nameCLM,lastnameCLM,studentIDCLM);//putting clumns in table
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);//مرتب کردن کلومن ها

        VBox vBox=new VBox();
        vBox.getChildren().addAll(getAddBTN(), getRemoveBTN(), getExitBTN());
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);

        this.setCenter(tableView);
        this.setRight(vBox);
    }

    public TableView<Student> getTableView() {
        return tableView;
    }

    public void setTableView(TableView<Student> tableView) {
        this.tableView = tableView;
    }

    public Button getAddBTN() {
        return addBTN;
    }

    public void setAddBTN(Button addBTN) {
        this.addBTN = addBTN;
    }

    public Button getRemoveBTN() {
        return removeBTN;
    }

    public void setRemoveBTN(Button removeBTN) {
        this.removeBTN = removeBTN;
    }

    public Button getExitBTN() {
        return exitBTN;
    }

    public void setExitBTN(Button exitBTN) {
        this.exitBTN = exitBTN;
    }
}
