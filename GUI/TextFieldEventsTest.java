package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEventsTest extends JFrame {
    JTextField celcius = new JTextField(10);
    JTextField fahrenheit = new JTextField(10);

    Container c = getContentPane();

    TextFieldEventsTest(){
        
        c.setLayout(new FlowLayout());
        c.add(new JLabel("Celcius"));
        c.add(celcius);
        
        celcius.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String cString = celcius.getText();
                double cValue = Double.parseDouble(cString.trim());
                double fValue = cValue * 9.0 / 5.0 + 32.0;
                fahrenheit.setText((int)fValue + "");
            }
        });

        c.add(new JLabel("Fahrenheit"));
        c.add(fahrenheit);
        
        fahrenheit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String fString = fahrenheit.getText();
                double fValue = Double.parseDouble(fString.trim());
                double cValue = (fValue - 32.0) * 5.0 / 9.0;
                celcius.setText((int)cValue + "");
            }
        });
    }

    public static void main(String[] args) {
        TextFieldEventsTest t = new TextFieldEventsTest();
        t.pack();
        t.show();
    }
}
