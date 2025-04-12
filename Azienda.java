import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Azienda {
    public void Esegui(){
        ThreadTempo t = new ThreadTempo();
        t.start();
        JFrame frame = new JFrame("Ristorante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        JTextArea textArea = new JTextArea(20, 50);
        frame.add(textArea);
    }

}