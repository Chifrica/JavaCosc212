package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameQuestion1 extends JFrame{
    JButton btn = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JLabel label = new JLabel("Result: ");
    JLabel label2 = new JLabel("");
    JLabel label3 = new JLabel("");

    int count = 0;

    public JFrameQuestion1(){
        super("Match");
        add(btn);
        add(btn2);
        setLayout(new GridLayout());
        setSize(500, 400);
        setVisible(true);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                count++;
                label.setText(count + " X 0");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                count++;
                label.setText("0 X " + count);
            }
        });

    }

    public static void main(String[] args) {
        new JFrameQuestion1();
    }
}
