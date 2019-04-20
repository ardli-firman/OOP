package services;

import java.io.*;
import javax.sound.sampled.*;

/**
 * MyPlayer
 */
public class MyPlayer {

    private AudioInputStream ais;
    private Clip clip;

    public MyPlayer(String filePath) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        ais = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(ais);
    }

    public void play() {
        clip.start();
    }

    public void stop() {
        clip.stop();
    }

    public void pause() {
    }

    public void resume() {
    }

    public void reset() {
    }
}
