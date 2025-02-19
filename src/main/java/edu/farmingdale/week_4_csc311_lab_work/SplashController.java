package edu.farmingdale.week_4_csc311_lab_work;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SplashController {
    @FXML
    private ImageView splashLogo;

    @FXML
    protected void loadLogin() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(FileApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("Week 4 CSC311: Login Screen");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void loadRegister() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(FileApplication.class.getResource("register-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("Week 4 CSC311: Register Screen");
        stage.setScene(scene);
        stage.show();
    }
}