package com.laughingalpaca.fsc_full_stack_project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class AppViewController implements Initializable {

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
    public Button deleteButton;
    @FXML
    public Button editButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageView.setImage(new Image(String.valueOf(AppEntry.class.getResource("default_picture_by_kliwir_art.png"))));

        HandleButtonActions();
    }

    private void HandleButtonActions(){
        clearButton.setOnAction(actionEvent -> {
            System.out.println("Clear button pressed...");
        });

        addButton.setOnAction(actionEvent -> {
            System.out.println("Add button pressed...");
        });

        deleteButton.setOnAction(actionEvent -> {
            System.out.println("Delete button pressed...");
        });

        editButton.setOnAction(actionEvent -> {
            System.out.println("Edit button pressed...");
        });
    }


}
