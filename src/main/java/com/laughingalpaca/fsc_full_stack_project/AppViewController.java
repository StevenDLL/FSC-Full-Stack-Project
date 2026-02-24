package com.laughingalpaca.fsc_full_stack_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class AppViewController {

    @FXML
    public MenuBar menuBar;
    @FXML
    public Pane leftPane;
    @FXML
    public ImageView imageView;
    @FXML
    public TableView<Object> tableView; //Would change type from object to be more specific if actually used.
    @FXML
    public Pane rightPane;

    //TextFields
    @FXML
    public TextField lastNameTextField;
    @FXML
    public TextField firstNameTextField;
    @FXML
    public TextField departmentTextField;
    @FXML
    public TextField majorTextField;
    @FXML
    public TextField emailTextField;
    @FXML
    public TextField imageTextField;


    //Buttons
    @FXML
    public Button clearButton;
    @FXML
    public Button addButton;
    @FXML
    public Button delteButton;
    @FXML
    public Button editButton;

}
