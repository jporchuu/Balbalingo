package scenes.projectScenes;

import java.io.IOException;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controller2  {

    @FXML
    private Button button;

    @FXML
    private AnchorPane container;

    @FXML
    private Circle selection1;

    @FXML
    private ImageView star1;

    @FXML
    private ImageView star2;

    @FXML
    private ImageView star3;

    @FXML
    private ImageView star4;

    @FXML
    private ImageView star5;

    @FXML
    private ImageView S1P1;

    @FXML
    private ImageView S1P2;

    @FXML
    private ImageView S1P3;

    @FXML
    private ImageView S2P1;

    @FXML
    private ImageView S2P2;

    @FXML
    private ImageView S2P3;

    @FXML
    private ImageView S3P1;

    @FXML
    private ImageView S3P2;

    @FXML
    private ImageView S3P3;

    @FXML
    private ImageView S4P1;

    @FXML
    private ImageView S4P2;

    @FXML
    private ImageView S4P3;

    @FXML
    private ImageView S5P1;

    @FXML
    private ImageView S5P2;

    @FXML
    private ImageView S5P3;

    @FXML
    private Rectangle yellowRect;

    @FXML
    private Rectangle redRect;

    @FXML
    private Rectangle blueRect;

    @FXML
    private Rectangle whiteRect;


    public void loadMoney(MouseEvent mouseEvent) throws IOException {

        // show scene2 timeline
        Parent root = FXMLLoader.load(getClass().getResource("money/moneyIntro.fxml"));
        Scene scene = selection1.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) selection1.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showScene3 = new Timeline();

        yellowRect.translateXProperty().set(0);
        blueRect.translateXProperty().set(0);
        redRect.translateXProperty().set(0);
        whiteRect.translateXProperty().set(0);

        KeyValue kvy = new KeyValue(yellowRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfy = new KeyFrame(Duration.seconds(0.8), kvy);

        KeyValue kvr = new KeyValue(redRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfr = new KeyFrame(Duration.seconds(1), kvr);

        KeyValue kvb = new KeyValue(blueRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfb = new KeyFrame(Duration.seconds(1.2), kvb);

        KeyValue kvw = new KeyValue(whiteRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfw = new KeyFrame(Duration.seconds(1.4), kvw);

        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);

        showScene3.getKeyFrames().add(kfy);
        showScene3.getKeyFrames().add(kfr);
        showScene3.getKeyFrames().add(kfb);
        showScene3.getKeyFrames().add(kfw);
        showScene3.getKeyFrames().add(kf);

        showScene3.play();
    }

    public void loadTime(MouseEvent mouseEvent) throws IOException {

        // show scene2 timeline
        Parent root = FXMLLoader.load(getClass().getResource("time/timeIntro.fxml"));
        Scene scene = selection1.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) selection1.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showScene3 = new Timeline();

        yellowRect.translateXProperty().set(0);
        blueRect.translateXProperty().set(0);
        redRect.translateXProperty().set(0);
        whiteRect.translateXProperty().set(0);

        KeyValue kvy = new KeyValue(yellowRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfy = new KeyFrame(Duration.seconds(0.8), kvy);

        KeyValue kvr = new KeyValue(redRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfr = new KeyFrame(Duration.seconds(1), kvr);

        KeyValue kvb = new KeyValue(blueRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfb = new KeyFrame(Duration.seconds(1.2), kvb);

        KeyValue kvw = new KeyValue(whiteRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfw = new KeyFrame(Duration.seconds(1.4), kvw);

        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);

        showScene3.getKeyFrames().add(kfy);
        showScene3.getKeyFrames().add(kfr);
        showScene3.getKeyFrames().add(kfb);
        showScene3.getKeyFrames().add(kfw);
        showScene3.getKeyFrames().add(kf);

        showScene3.play();
    }

    public void loadPeople(MouseEvent mouseEvent) throws IOException {

        // show scene2 timeline
        Parent root = FXMLLoader.load(getClass().getResource("people/peopleIntro.fxml"));
        Scene scene = selection1.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) selection1.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showScene3 = new Timeline();

        yellowRect.translateXProperty().set(0);
        blueRect.translateXProperty().set(0);
        redRect.translateXProperty().set(0);
        whiteRect.translateXProperty().set(0);

        KeyValue kvy = new KeyValue(yellowRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfy = new KeyFrame(Duration.seconds(0.8), kvy);

        KeyValue kvr = new KeyValue(redRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfr = new KeyFrame(Duration.seconds(1), kvr);

        KeyValue kvb = new KeyValue(blueRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfb = new KeyFrame(Duration.seconds(1.2), kvb);

        KeyValue kvw = new KeyValue(whiteRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfw = new KeyFrame(Duration.seconds(1.4), kvw);

        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);

        showScene3.getKeyFrames().add(kfy);
        showScene3.getKeyFrames().add(kfr);
        showScene3.getKeyFrames().add(kfb);
        showScene3.getKeyFrames().add(kfw);
        showScene3.getKeyFrames().add(kf);

        showScene3.play();
    }

    public void loadVerbs(MouseEvent mouseEvent) throws IOException {

        // show scene2 timeline
        Parent root = FXMLLoader.load(getClass().getResource("verbs/verbsIntro.fxml"));
        Scene scene = selection1.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) selection1.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showScene3 = new Timeline();

        yellowRect.translateXProperty().set(0);
        blueRect.translateXProperty().set(0);
        redRect.translateXProperty().set(0);
        whiteRect.translateXProperty().set(0);

        KeyValue kvy = new KeyValue(yellowRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfy = new KeyFrame(Duration.seconds(0.8), kvy);

        KeyValue kvr = new KeyValue(redRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfr = new KeyFrame(Duration.seconds(1), kvr);

        KeyValue kvb = new KeyValue(blueRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfb = new KeyFrame(Duration.seconds(1.2), kvb);

        KeyValue kvw = new KeyValue(whiteRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfw = new KeyFrame(Duration.seconds(1.4), kvw);

        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);

        showScene3.getKeyFrames().add(kfy);
        showScene3.getKeyFrames().add(kfr);
        showScene3.getKeyFrames().add(kfb);
        showScene3.getKeyFrames().add(kfw);
        showScene3.getKeyFrames().add(kf);

        showScene3.play();
    }

    public void loadFood(MouseEvent mouseEvent) throws IOException {

        // show scene2 timeline
        Parent root = FXMLLoader.load(getClass().getResource("food/foodIntro.fxml"));
        Scene scene = selection1.getScene();

        root.translateXProperty().set(1300);

        StackPane parentContainer = (StackPane) selection1.getScene().getRoot();
        parentContainer.getChildren().add(root);

        Timeline showScene3 = new Timeline();

        yellowRect.translateXProperty().set(0);
        blueRect.translateXProperty().set(0);
        redRect.translateXProperty().set(0);
        whiteRect.translateXProperty().set(0);

        KeyValue kvy = new KeyValue(yellowRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfy = new KeyFrame(Duration.seconds(0.8), kvy);

        KeyValue kvr = new KeyValue(redRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfr = new KeyFrame(Duration.seconds(1), kvr);

        KeyValue kvb = new KeyValue(blueRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfb = new KeyFrame(Duration.seconds(1.2), kvb);

        KeyValue kvw = new KeyValue(whiteRect.translateXProperty(), -500, Interpolator.EASE_OUT);
        KeyFrame kfw = new KeyFrame(Duration.seconds(1.4), kvw);

        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_IN);
        KeyFrame kf = new KeyFrame(Duration.seconds(0.5), kv);

        showScene3.getKeyFrames().add(kfy);
        showScene3.getKeyFrames().add(kfr);
        showScene3.getKeyFrames().add(kfb);
        showScene3.getKeyFrames().add(kfw);
        showScene3.getKeyFrames().add(kf);

        showScene3.play();
    }

    public void initialize(){

        Timeline rectDash = new Timeline();

        yellowRect.translateXProperty().set(-1500);
        blueRect.translateXProperty().set(-1500);
        redRect.translateXProperty().set(-1500);
        whiteRect.translateXProperty().set(-1500);

        KeyValue kvy = new KeyValue(yellowRect.translateXProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kfy = new KeyFrame(Duration.seconds(0.5), kvy);

        KeyValue kvr = new KeyValue(redRect.translateXProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kfr = new KeyFrame(Duration.seconds(0.6), kvr);

        KeyValue kvb = new KeyValue(blueRect.translateXProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kfb = new KeyFrame(Duration.seconds(0.7), kvb);

        KeyValue kvw = new KeyValue(whiteRect.translateXProperty(), 0, Interpolator.EASE_OUT);
        KeyFrame kfw = new KeyFrame(Duration.seconds(0.8), kvw);

        rectDash.getKeyFrames().add(kfy);
        rectDash.getKeyFrames().add(kfr);
        rectDash.getKeyFrames().add(kfb);
        rectDash.getKeyFrames().add(kfw);

        rectDash.play();

        star1.setOpacity(0);
        star2.setOpacity(0);
        star3.setOpacity(0);
        star4.setOpacity(0);
        star5.setOpacity(0);

        // SECTOR 1
        if(scenes.scores.Sector01Score >= 9){
            star1.setOpacity(1);
        }

        if(scenes.scores.Sector01Score <= 2){
            S1P1.setOpacity(0);
            S1P2.setOpacity(0);
            S1P3.setOpacity(0);
        }
        else if(scenes.scores.Sector01Score <= 5){
            S1P1.setOpacity(1);
            S1P2.setOpacity(0);
            S1P3.setOpacity(0);
        }
        else if(scenes.scores.Sector01Score <= 8){
            S1P1.setOpacity(0);
            S1P2.setOpacity(1);
            S1P3.setOpacity(0);
        }
        else if(scenes.scores.Sector01Score >= 9){
            S1P1.setOpacity(0);
            S1P2.setOpacity(0);
            S1P3.setOpacity(1);
        }

        // SECTOR 2
        if(scenes.scores.Sector02Score >= 9){
            star2.setOpacity(1);
        }

        if(scenes.scores.Sector02Score <= 3){
            S2P1.setOpacity(0);
            S2P2.setOpacity(0);
            S2P3.setOpacity(0);
        }
        else if(scenes.scores.Sector02Score <= 6){
            S2P1.setOpacity(1);
            S2P2.setOpacity(0);
            S2P3.setOpacity(0);
        }
        else if(scenes.scores.Sector02Score <= 8){
            S2P1.setOpacity(0);
            S2P2.setOpacity(1);
            S2P3.setOpacity(0);
        }
        else if(scenes.scores.Sector02Score >= 9){
            S2P1.setOpacity(0);
            S2P2.setOpacity(0);
            S2P3.setOpacity(1);
        }

        // SECTOR 3
        if(scenes.scores.Sector03Score >= 9){
            star3.setOpacity(1);
        }

        if(scenes.scores.Sector03Score <= 2){
            S3P1.setOpacity(0);
            S3P2.setOpacity(0);
            S3P3.setOpacity(0);
        }
        else if(scenes.scores.Sector03Score <= 5){
            S3P1.setOpacity(1);
            S3P2.setOpacity(0);
            S3P3.setOpacity(0);
        }
        else if(scenes.scores.Sector03Score <= 8){
            S3P1.setOpacity(0);
            S3P2.setOpacity(1);
            S3P3.setOpacity(0);
        }
        else if(scenes.scores.Sector03Score >= 9){
            S3P1.setOpacity(0);
            S3P2.setOpacity(0);
            S3P3.setOpacity(1);
        }

        // SECTOR 4
        if(scenes.scores.Sector04Score >= 9){
            star4.setOpacity(1);
        }

        if(scenes.scores.Sector04Score <= 2){
            S4P1.setOpacity(0);
            S4P2.setOpacity(0);
            S4P3.setOpacity(0);
        }
        else if(scenes.scores.Sector04Score <= 5){
            S4P1.setOpacity(1);
            S4P2.setOpacity(0);
            S4P3.setOpacity(0);
        }
        else if(scenes.scores.Sector04Score <= 8){
            S4P1.setOpacity(0);
            S4P2.setOpacity(1);
            S4P3.setOpacity(0);
        }
        else if(scenes.scores.Sector04Score >= 9){
            S4P1.setOpacity(0);
            S4P2.setOpacity(0);
            S4P3.setOpacity(1);
        }

        // SECTOR 5
        if(scenes.scores.Sector05Score >= 9){
            star5.setOpacity(1);
        }

        if(scenes.scores.Sector05Score <= 2){
            S5P1.setOpacity(0);
            S5P2.setOpacity(0);
            S5P3.setOpacity(0);
        }
        else if(scenes.scores.Sector05Score <= 5){
            S5P1.setOpacity(1);
            S5P2.setOpacity(0);
            S5P3.setOpacity(0);
        }
        else if(scenes.scores.Sector05Score <= 8){
            S5P1.setOpacity(0);
            S5P2.setOpacity(1);
            S5P3.setOpacity(0);
        }
        else if(scenes.scores.Sector05Score >= 9){
            S5P1.setOpacity(0);
            S5P2.setOpacity(0);
            S5P3.setOpacity(1);
        }
    }
}

