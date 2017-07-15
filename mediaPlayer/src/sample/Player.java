package sample;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


/**
 * Created by udit01 on 15/7/17.
 */
public class Player extends BorderPane {

    public  Media media;
    public  MediaPlayer player;
    public  MediaView view;
    public  Pane mpane;

    public Player(String file){
        media = new Media(file);
        player = new MediaPlayer(media);
        view = new MediaView(player);
        mpane = new Pane();

        mpane.getChildren().add(view);

        setCenter(mpane);

        player.play();
        System.out.println("Reached end of constructor");
    }
}
