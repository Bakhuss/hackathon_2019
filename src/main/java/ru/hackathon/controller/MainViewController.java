package ru.hackathon.controller;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import org.w3c.dom.NodeList;
import ru.hackathon.App;
import ru.hackathon.dao.FromMySql;

import java.util.stream.Stream;

import static javafx.scene.media.MediaPlayer.Status.STOPPED;


public class MainViewController {

    @FXML
    private MediaView video;
    @FXML
    private WebView data;

    private Media media;
    private MediaPlayer mediaPlayer;
    private double currentTime;

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    private void methodPlay() {
        if (mediaPlayer == null) {
            media = new Media("http://pkg.bakhuss.ru/hackaton_bd/video/2019/03/30/1/video1.mp4");
            mediaPlayer = new MediaPlayer(media);
            video.setMediaPlayer(mediaPlayer);
        }
        System.out.println(mediaPlayer.getStatus());
        mediaPlayer.play();
    }

    @FXML
    private void methodPause() {
        if (mediaPlayer == null) return;
        System.out.println(mediaPlayer.getStatus());
        mediaPlayer.pause();
    }

    @FXML
    private void methodNext() {
        if (mediaPlayer == null) return;
        System.out.println(mediaPlayer.getStatus());
        double currentTime = mediaPlayer.getCurrentTime().toMillis();
        Duration duration = new Duration(currentTime + 5000.0);
        System.out.println(currentTime);
        mediaPlayer.seek(duration);
    }

    @FXML
    private void methodStop() {
//        System.out.println(data.getEngine().getDocument().getElementsByTagName("a").item(1).toString());
        if (mediaPlayer == null) return;
        mediaPlayer.stop();
    }

    @FXML
    private void getData() {
        data.getEngine().load("http://pkg.bakhuss.ru/hackaton_bd/video/2019/03/30/1/");
    }
}
