package GUI;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddingComponents extends JFrame{

    JButton button = new JButton("Press Me");
    JButton button1 = new JButton("Reset Total");

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
        cp.add(button1);

        button1.addActionListener(new ActionListener() {
            public void actionPerfomed(ActionEvent ae){
                String value = textField.getText();
                double fvalue = Double.parseDouble(value.trim());
                double dvalue = fvalue * 0;
                textField.setText((int)dvalue + "");
                // sum += 1;
                // textField.setText(sum + "");
                // Toolkit.getDefaultToolkit().beep();
            }
        });
    }
    public static void main(String[] args) {
        new AddingComponents();
    }
}