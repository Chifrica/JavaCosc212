package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Button extends JFrame{
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        JButton jb = new JButton("Bt");
        MyListenerClass myListener = new MyListenerClass();

        jb.addActionListener(myListener);
        jf.add(jb);
        jf.setLocation(150, 150);
        jf.setSize(200, 200);
        jf.setVisible(true);
    }
}

class MyListenerClass implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "I was clicked!");
    }
}