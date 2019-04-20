package ui;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import services.MyPlayer;
import javax.sound.sampled.*;
import java.io.*;

/**
 * MainUI
 */
public class MainUI extends JFrame {
    private JButton btnPlay;
    private JButton btnStop;
    private Container contentPane;
    private MyPlayer player;

    public MainUI() {
        try {
            player = new MyPlayer("./audio/sample.au");

        } catch (UnsupportedAudioFileException e) {
            // TODO: handle exception
        } catch (LineUnavailableException e) {

        } catch (IOException e) {
            JOptionPane.showMessageDiaglog(this, "" + e.getMessage());
        }
        initUI();
    }

    private void initUI() {
        btnPlay = new JButton("Putar");
        btnStop = new JButton("Hentikan");

        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        contentPane.add(btnPlay);
        contentPane.add(btnStop);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPlay.addActionListener(new BtnPlayClick());
        btnStop.addActionListener(new BtnStopClick());

    }

    private class BtnPlayClick implements ActionListener {
        public void actionPerformed(ActionListener evt) {
            player.play();
        }
    }

    private class BtnStopClick implements ActionListener {
        public void actionPerformed(ActionListener evt) {
            player.stop();
        }
    }
}