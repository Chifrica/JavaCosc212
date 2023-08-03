package GUI;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        JButton btn1 = new JButton("Click me");

        OuterClass oc = new OuterClass();
        btn1.addActionListener(oc);
        frame.add(btn1);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

class OuterClass implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "I was clicked!");
    }
}