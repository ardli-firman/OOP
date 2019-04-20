import javax.swing.JLabel;

import javax.swing.*;

public class Aplikasi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi akses gambar");
        ImageIcon gambar = new ImageIcon("img/de.jpg");

        JLabel label = new JLabel(gambar);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}