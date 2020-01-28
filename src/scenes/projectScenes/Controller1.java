package scenes.projectScenes;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Delayed;

import com.jfoenix.controls.JFXButton;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;

//import javax.xml.soap.Text;

public class Controller1 implements Initializable{


    @FXML
    private AnchorPane anchorRoot;

    @FXML
    private StackPane parentContainer;

    @FXML
    private Rectangle blueRect;

    @FXML
    private Rectangle redRect;

    @FXML
    private JFXButton whiteButton;
    @FXML
    private ImageView titleLogo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Timeline MenuObjectsTimeline = new Timeline();

        blueRect.translateYProperty().set(-2000);
        KeyValue kvblue = new KeyValue(blueRect.translateYProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kfblue = new KeyFrame(Duration.seconds(1.2), kvblue);

        redRect.translateYProperty().set(-2000);
        KeyValue kvred = new KeyValue(redRect.translateYProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kfred = new KeyFrame(Duration.seconds(1.5), kvred);


        whiteButton.translateXProperty().set(2500);
        KeyValue kv2 = new KeyValue(whiteButton.translateXProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kf2 = new KeyFrame(Duration.seconds(1.2), kv2);

        MenuObjectsTimeline.getKeyFrames().add(kfblue);
        MenuObjectsTimeline.getKeyFrames().add(kfred);
        MenuObjectsTimeline.getKeyFrames().add(kf2);

        MenuObjectsTimeline.play();

        FadeTransition fadeInLogo = new FadeTransition(Duration.seconds(1.3), titleLogo);
        fadeInLogo.setFromValue(0.0);
        fadeInLogo.setToValue(1.0);
        fadeInLogo.play();

    }

    @FXML
    private void loadScene(ActionEvent event) throws IOException, InterruptedException {

        // simultaneous yellow and button move timeline
        Timeline MenuObjectsTimeline = new Timeline();

        blueRect.translateYProperty().set(0);
        KeyValue kvblue = new KeyValue(blueRect.translateYProperty(), -900, Interpolator.EASE_IN);
        KeyFrame kfblue = new KeyFrame(Duration.seconds(0.7), kvblue);


        redRect.translateYProperty().set(0);
        KeyValue kvred = new KeyValue(redRect.translateYProperty(), -900, Interpolator.EASE_IN);
        KeyFrame kfred = new KeyFrame(Duration.seconds(0.4), kvred);


        whiteButton.translateXProperty().set(0);
        KeyValue kv2 = new KeyValue(whiteButton.translateXProperty(), 1300, Interpolator.EASE_IN);
        KeyFrame kf2 = new KeyFrame(Duration.seconds(0.7), kv2);

        MenuObjectsTimeline.getKeyFrames().add(kfblue);
        MenuObjectsTimeline.getKeyFrames().add(kfred);
        MenuObjectsTimeline.getKeyFrames().add(kf2);


        // move scene1 timeline
        anchorRoot.translateYProperty().set(0);
        Timeline moveScene1 = new Timeline();
        KeyValue kv3 = new KeyValue(anchorRoot.translateYProperty(), -900, Interpolator.EASE_IN);
        KeyFrame kf3 = new KeyFrame(Duration.seconds(0.7), kv3);
        moveScene1.getKeyFrames().add(kf3);

        //fade out text
        FadeTransition fadeOutLogo = new FadeTransition(Duration.seconds(1), titleLogo);
        fadeOutLogo.setFromValue(1.0);
        fadeOutLogo.setToValue(0.0);
        fadeOutLogo.play();


        // show scene2 timeline
        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        //Scene scene = whiteButton.getScene();
        root.translateXProperty().set(1300);
        StackPane parentContainer = (StackPane) whiteButton.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showScene2 = new Timeline();
        KeyValue kv4 = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf4 = new KeyFrame(Duration.seconds(0.7), kv4);
        showScene2.getKeyFrames().add(kf4);

        SequentialTransition sequence = new SequentialTransition(MenuObjectsTimeline, moveScene1, showScene2);
        sequence.play();
    }


}



