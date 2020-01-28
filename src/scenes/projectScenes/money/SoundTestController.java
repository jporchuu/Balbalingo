package scenes.projectScenes.money;

import javafx.animation.FadeTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import java.io.IOException;


import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;


import javafx.util.Duration;


public class SoundTestController {

    private ConfigurationManager cm;
    private Recognizer recognizer;
    private Microphone microphone;
    Result result;

    @FXML
    private AnchorPane Pane11;

    @FXML
    private ImageView correct;

    @FXML
    private ImageView wrong;

    @FXML
    private ImageView forward;

    public void initialize() throws InstantiationException, IOException, PropertyException {
        result = null;
        cm = new ConfigurationManager(SoundTestController.class.getResource("stt-config.xml"));
        recognizer = (Recognizer) cm.lookup("recognizer");
        microphone = (Microphone) cm.lookup("microphone");
        recognizer.allocate();
    }

    public void playSound20(){
        String musicFile = "src/assets/money/bente.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void playSound50(){
        String musicFile = "src/assets/money/singkwenta.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void playSound15(){
        String musicFile = "src/assets/money/kinse.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void recognizeText20() {
        result = null;

        microphone.startRecording();
        result = recognizer.recognize();

        if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();

            if (resultText.equals("twenty")){
                scenes.scores.Sector01Score = scenes.scores.Sector01Score + 1;

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

                scenes.scores.Sector01Scene = scenes.scores.Sector01Scene + 1;

                if (scenes.scores.Sector01Scene > 9) {
                    scenes.scores.Sector01Clear = true;
                    scenes.scores.Sector01Scene = scenes.scores.Sector01Scene - 1;
                }
            }

            else{

                FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.2), wrong);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();
            }
        } else {
        }
    }

    public void recognizeText50() {
        result = null;

        microphone.startRecording();
        result = recognizer.recognize();

        if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();

            if (resultText.equals("fifty")){
                scenes.scores.Sector01Score = scenes.scores.Sector01Score + 1;

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

                scenes.scores.Sector01Scene = scenes.scores.Sector01Scene + 1;

                if (scenes.scores.Sector01Scene > 9) {
                    scenes.scores.Sector01Clear = true;
                    scenes.scores.Sector01Scene = scenes.scores.Sector01Scene - 1;
                }
            }

            else{

                FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.2), wrong);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();
            }
        } else {
        }
    }

    public void recognizeText15() {
        result = null;

        microphone.startRecording();
        result = recognizer.recognize();

        if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();

            if (resultText.equals("fifteen")){
                scenes.scores.Sector01Score = scenes.scores.Sector01Score + 1;

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

                scenes.scores.Sector01Scene = scenes.scores.Sector01Scene + 1;

                if (scenes.scores.Sector01Scene > 9) {
                    scenes.scores.Sector01Clear = true;
                    scenes.scores.Sector01Scene = scenes.scores.Sector01Scene - 1;
                }
            }

            else{

                FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.2), wrong);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();
            }
        } else {
        }
    }


    public void getNext(MouseEvent mouseEvent) throws IOException {
        microphone.stopRecording();

        if(scenes.scores.Sector01Score >= 9){
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("LevelComplete.fxml"));
            Pane11.getChildren().setAll(nextpane);
        }
        else{
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("Level"+scenes.scores.Sector01Scene+".fxml"));
            Pane11.getChildren().setAll(nextpane);
        }
    }

    public void back(ActionEvent event) throws IOException {
        microphone.stopRecording();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../scene2.fxml"));
        Pane11.getChildren().setAll(pane);
    }
}
