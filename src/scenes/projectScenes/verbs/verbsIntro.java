package scenes.projectScenes.verbs;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import javafx.event.ActionEvent;
import java.io.IOException;

public class verbsIntro {

    private int currentScene = scenes.scores.Sector04Scene;

    @FXML
    private AnchorPane L1IntroPane;

    public void startLevel(ActionEvent event) throws IOException {

        if (currentScene == 1){
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("L1Intro.fxml"));
            L1IntroPane.getChildren().setAll(nextpane);
        }
        else if (scenes.scores.Sector04Clear == true) {
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("LevelComplete.fxml"));
            L1IntroPane.getChildren().setAll(nextpane);
        }
        else{
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("Level"+currentScene+".fxml"));
            L1IntroPane.getChildren().setAll(nextpane);
        }
    }

    public void back(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../scene2.fxml"));
        L1IntroPane.getChildren().setAll(pane);
    }
}
