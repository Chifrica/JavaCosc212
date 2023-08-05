package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameQuestion1 extends JFrame{
    JButton btn = new JButton("AC Milan");
    JButton btn2 = new JButton("Real Madrid");
    JLabel label = new JLabel("Result: ");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner: ");

    int count = 0;
    int count2 = 0;

    public JFrameQuestion1(){
        super("Match");
        add(btn);
        add(btn2);
        add(label);
        add(label2);
        add(label3);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(200, 300);
        setVisible(true);
        
        InnerClass listener = new InnerClass();
        btn.addActionListener(listener);
        btn2.addActionListener(listener);
    }

    class InnerClass implements ActionListener{
        public void actionPerformed(ActionEvent ae){

            // Result
            if(ae.getSource() == btn){
                count++;
                label.setText("Result: " + count + " X " + count2);
            } else {
                count2++;
                label.setText("Result: " + count + " X " + count2);
            }

            // Last Scorer

            if(ae.getSource() == btn){
                label2.setText("Last Scorer: AC Mailan");
            } else {
                label2.setText("Last Scorer: Real Madrid");
            }

            // Winner
            if (count > count2) {
                label3.setText("Winner: AC Milan ");
            } else if (count < count2) {
                label3.setText("Winner: Real Madrid");
            } else {
                label3.setText("Winner: DRAW");
            }
        }
    }

    public static void main(String[] args) {
        new JFrameQuestion1();
    }
}