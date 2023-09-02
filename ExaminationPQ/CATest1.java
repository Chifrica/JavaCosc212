import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CATest1 extends JFrame{

    // Instance variables
    private JTextField nameSet; 
    private JTextField addressSet;

    private JLabel lb1;
    private JLabel lb2;

    JButton btn1;
    JButton btn2;

    public CATest1() {
        super("CA");
        setLayout(new FlowLayout());
        setSize(200, 150);

        lb1 = new JLabel("Name:");
        lb2 = new JLabel("Address:");
        
        nameSet = new JTextField(10);
        addressSet = new JTextField(10);

        btn1 = new JButton("Clear");
        btn2 = new JButton("Exit");

        add(lb1);
        add(nameSet);
        add(lb2);
        add(addressSet);
        add(btn1);
        add(btn2);

        CATest1Handler handler = new CATest1Handler();
        btn1.addActionListener(handler);

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
    }

    // Inner class
    public class CATest1Handler implements ActionListener {
        public void actionPerformed (ActionEvent ae){
            nameSet.setText("");
            addressSet.setText("");
        }
    }
}