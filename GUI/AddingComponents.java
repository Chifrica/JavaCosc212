import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddingComponents extends JFrame{
    JButton button = new JButton("Press Me");
    JLabel label = new JLabel("Running Total");
    JTextField textField = new JTextField(10);
    Container cp = new getContentPane();

    public AddingComponents(){
        super("A Container With Components");
        setSize(300, 100);
        cp.setLayout(new FlowLayout());
        cp.add(label);
        cp.add(textField);
        cp.add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddingComponents();
    }
}