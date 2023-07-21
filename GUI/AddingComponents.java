package GUI;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddingComponents extends JFrame{

    JButton button = new JButton("Press Me");
    // JButton button1 = new JButton("Click on me");

    JLabel label = new JLabel("Running Total");
    JTextField textField = new JTextField(5);

    Container cp = getContentPane();

    public AddingComponents(){
        super("A Container With Components");
        setSize(300, 100);
        cp.setLayout(new FlowLayout());
        cp.add(label);
        cp.add(textField);
        cp.add(button);
        setVisible(true);
        // cp.add(button1);
    }
    public static void main(String[] args) {
        new AddingComponents();
    }
}