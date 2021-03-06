package scenes.projectScenes.people;

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

    public void playSound1(){
        String musicFile = "src/assets/people/Noypi.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void playSound2(){
        String musicFile = "src/assets/people/Jowa.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void playSound3(){
        String musicFile = "src/assets/people/Kano.mp3";

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }

    public void recognizeText1() {
        result = null;

        microphone.startRecording();
        result = recognizer.recognize();

        if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();

            if (resultText.equals("filipino")){
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
                    scenes.scores.Sector03Clear = true;
                    scenes.scores.Sector03Scene = scenes.scores.Sector03Scene - 1;
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

    public void recognizeText2() {
        result = null;

        microphone.startRecording();
        result = recognizer.recognize();

        if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();

            if (resultText.equals("girlfriend") || resultText.equals("boyfriend")){
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
                    scenes.scores.Sector03Clear = true;
                    scenes.scores.Sector03Scene = scenes.scores.Sector03Scene - 1;
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

    public void recognizeText3() {
        result = null;

        microphone.startRecording();
        result = recognizer.recognize();

        if (result != null) {
            String resultText = result.getBestFinalResultNoFiller();

            if (resultText.equals("american")){
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
                    scenes.scores.Sector03Clear = true;
                    scenes.scores.Sector03Scene = scenes.scores.Sector03Scene - 1;
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

        if(scenes.scores.Sector03Score >= 9){
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("LevelComplete.fxml"));
            Pane11.getChildren().setAll(nextpane);
        }
        else{
            AnchorPane nextpane = FXMLLoader.load(getClass().getResource("Level"+scenes.scores.Sector03Scene+".fxml"));
            Pane11.getChildren().setAll(nextpane);
        }
    }

    public void back(ActionEvent event) throws IOException {
        microphone.stopRecording();
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../scene2.fxml"));
        Pane11.getChildren().setAll(pane);
    }
}
