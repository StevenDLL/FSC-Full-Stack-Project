package com.laughingalpaca.fsc_full_stack_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class AppEntry extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppEntry.class.getResource("AppView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        scene.getStylesheets().add(String.valueOf(AppEntry.class.getResource("stylesheet.css")));
        stage.setTitle("FSC CSC325_Full Stack Project");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNIFIED);
        stage.show();
    }
}
