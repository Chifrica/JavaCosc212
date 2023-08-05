package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldExample extends JFrame{

    JTextField jta = new JTextField(10);
    Font ft = new Font("Time new roman", Font.BOLD, 20);
    
    TextFieldExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 100);
        add(jta);
        jta.setForeground(Color.PINK);
        jta.setVisible(true);
        jta.setFont(ft);
    }
    public static void main(String[] args) {
        new TextFieldExample();
    }
}
