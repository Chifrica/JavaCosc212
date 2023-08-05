package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TextAreaExample extends JFrame {

    JTextArea jta = new JTextArea(10, 25);
    JButton button = new JButton("Add some text");

    public TextAreaExample(){
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(jta);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String txt = JOptionPane.showInputDialog(null, "Insert some text");
                jta.append(txt);
            }
        });
    }
    public static void main(String[] args) {
        new TextAreaExample().setVisible(true);;
    }
}
