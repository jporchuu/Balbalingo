package scenes.projectScenes.people;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.io.IOException;

public class LevelIntro {

    @FXML
    private AnchorPane L1Pane;


    public void nextPageL1(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Scene scene = L1Pane.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) L1Pane.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showL11 = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
        showL11.getKeyFrames().add(kf);
        showL11.play();
    }

    public void nextPageL2(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Level4.fxml"));
        Scene scene = L1Pane.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) L1Pane.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showL11 = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
        showL11.getKeyFrames().add(kf);
        showL11.play();
    }

    public void nextPageL3(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Level7.fxml"));
        Scene scene = L1Pane.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) L1Pane.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showL11 = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
        showL11.getKeyFrames().add(kf);
        showL11.play();
    }

    public void nextPageHome(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../scene2.fxml"));
        Scene scene = L1Pane.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) L1Pane.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showL11 = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
        showL11.getKeyFrames().add(kf);
        showL11.play();
    }
}
