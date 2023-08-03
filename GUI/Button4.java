package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Example of more than one components using same Listener

/*
 * This example demonstrates how we can store the count of how Many times we press on a Button. 
 * We can create instance variables count1 and count2 and each one of these will be accessed by the 
    listener class easily (unlike if the listener was outside the class).
 */
public class Button4 {
    int count1;
    int count2;

    JFrame frame = new JFrame("Example");
    JButton btn1 = new JButton("Click me");
    JButton btn2 = new JButton("Cleck me");

    public Button4(){
        count1 = 0;
        count2 = 0;

        InnerClass listener = new InnerClass();

        btn1.addActionListener(listener);
        btn2.addActionListener(listener);

        frame.setLayout(new FlowLayout());
        frame.add(btn1);
        frame.add(btn2);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    class InnerClass implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == btn1){
                count1++;
                JOptionPane.showMessageDialog(null, "1st Button " + count1 + "times");
            } else {
                count2++;
                JOptionPane.showMessageDialog(null, "2nd Button " + count2 + "times");
            }
        }
    }

    public static void main(String[] args) {
        new Button4();
    }
}
