package GUI;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonLabelJ extends JFrame{
    JButton btn1 = new JButton("Click me");
    JLabel label = new JLabel("");

    int count = 0;

    public ButtonLabelJ(){
        super("My Application");
        setSize(200, 200);
        setLayout(new FlowLayout());
        add(btn1);
        add(label);
        setVisible(true);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                count++;
                label.setText("Button was clicked " + count + " Times");
            }
        });
    }

    public static void main(String[] args) {
        new ButtonLabelJ();
    }
}