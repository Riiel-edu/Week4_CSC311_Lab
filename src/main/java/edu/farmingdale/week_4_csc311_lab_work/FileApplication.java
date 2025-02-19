package edu.farmingdale.week_4_csc311_lab_work;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class FileApplication extends Application {
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FileApplication.class.getResource("splash-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Week 4 CSC311");
        stage.setScene(scene);
        stage.show();

    }
        /*
    public void startLogin() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FileApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("Week 4 CSC311: Login Screen");
        stage.setScene(scene);
        stage.show();
    }
        */


    public static void main(String[] args) {
        launch();
    }
}