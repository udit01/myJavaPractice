package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        String str = new File("/home/udit01/clip.mp4").toURI().toString();
//        System.out.println(str);


        Player pl = new Player("file:/home/udit01/clip.mp4");

        Scene sc = new Scene(pl,720,480, Color.BLACK);
        primaryStage.setScene(sc);
        primaryStage.show();

        System.out.println("Reached end of start");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
