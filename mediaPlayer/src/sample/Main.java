package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import         javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

//import java.awt.*;
//import java.awt.MenuBar;
//import java.awt.MenuItem;
import java.io.File;
import java.net.MalformedURLException;

public class Main extends Application {
    Player pl;
    FileChooser fileChooser;
    @Override
    public void start(final Stage primaryStage) throws Exception {
//        String str = new File("/home/udit01/clip.mp4").toURI().toString();
//        System.out.println(str);

        MenuItem open = new MenuItem("Open");
        Menu file = new Menu("File");
        MenuBar menu = new MenuBar();

        file.getItems().add(open);
        menu.getMenus().add(file);

        fileChooser = new FileChooser();

        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                pl.player.pause();
                File file = fileChooser.showOpenDialog(primaryStage);
                if (file != null){
                    try{
                        pl  = new Player(file.toURI().toURL().toExternalForm());
                        Scene scene = new Scene(pl,720,535,Color.BLACK);
                        primaryStage.setScene(scene);
                    }
                    catch (MalformedURLException e1){
                        //
                        e1.printStackTrace();
                    }
                }
            }
        });

        pl = new Player("file:/home/udit01/clip.mp4");
        pl.setTop(menu);

        Scene sc = new Scene(pl,720,535, Color.BLACK);
        primaryStage.setScene(sc);
        primaryStage.show();

        System.out.println("Reached end of start");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
