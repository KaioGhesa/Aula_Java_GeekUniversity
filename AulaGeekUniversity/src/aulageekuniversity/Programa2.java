package aulageekuniversity;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa2 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Geek University");
        
        JPanel panel = new  JPanel();
        
        JButton bt1 = new JButton("Seja bem vinde");
        JButton bt2 = new JButton("Programação para leigos");
        JButton bt3 = new JButton("Introdução para Java");
        
        panel.setLayout(new BorderLayout(1,0));
        
        panel.add(bt1, BorderLayout.NORTH);
        panel.add(bt2, BorderLayout.CENTER);
        panel.add(bt3, BorderLayout.SOUTH);
        
        frame.setContentPane(panel);
        frame.pack();
        frame.setSize(640,480);
        frame.setVisible(true);
    }
}
