package scenes.projectScenes.people;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import javafx.event.ActionEvent;

import java.io.IOException;


    public class MultipleChoiceController extends scenes.scores{



        @FXML
        private AnchorPane Pane11;

        @FXML
        private ImageView correct;

        @FXML
        private ImageView wrong;

        @FXML
        private ImageView forward;


        public void getRightChoice(ActionEvent event){

            scenes.scores.Sector03Score = scenes.scores.Sector03Score + 1;

            FadeTransition fadeInMark = new FadeTransition(Duration.seconds(0.2), correct);
            fadeInMark.setFromValue(0.0);
            fadeInMark.setToValue(1.0);
            fadeInMark.play();

            FadeTransition fadeInButton = new FadeTransition(Duration.seconds(0.2), forward);
            fadeInButton.setFromValue(0.0);
            fadeInButton.setToValue(1.0);

            SequentialTransition sequence = new SequentialTransition(fadeInMark, fadeInButton);
            sequence.play();

            Pane11.getChildren().remove(wrong);

            scenes.scores.Sector03Scene = scenes.scores.Sector03Scene + 1;

            if (scenes.scores.Sector03Scene > 9) {
                scenes.scores.Sector03Scene = scenes.scores.Sector03Scene - 1;
            }

        }

        public void getWrongChoice(ActionEvent event) {
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.2), wrong);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        }


        public void getNext(MouseEvent mouseEvent) throws IOException {
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("Level"+scenes.scores.Sector03Scene+".fxml"));
            Pane11.getChildren().setAll(nextpane);
        }

        public void getL2Next(MouseEvent mouseEvent) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("L2Intro.fxml"));
            Scene scene = Pane11.getScene();

            root.translateXProperty().set(1300);

            StackPane parentContainer = (StackPane) Pane11.getScene().getRoot();
            parentContainer.getChildren().add(root);

            Timeline showL13 = new Timeline();
            KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);
            showL13.getKeyFrames().add(kf);
            showL13.play();
        }

        public void back(ActionEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("../scene2.fxml"));
           Pane11.getChildren().setAll(pane);
        }

    }
