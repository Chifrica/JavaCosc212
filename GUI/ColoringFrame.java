package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColoringFrame extends JFrame{
    JLabel label = new JLabel("Where do you want to go from here?");

    public ColoringFrame(){
        getContentPane().setBackground(new Color(0, 0, 255));
        setSize(500, 100);
        add(label);
        label.setFont(new Font("Times new Roman", Font.BOLD, 34));
        label.setForeground(Color.red);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColoringFrame();
    }
}
