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
        // Application name
        super("CA");
        // Layout manager
        setLayout(new FlowLayout());
        // Windoe size
        setSize(200, 150);

        // Declearation of JLabel variables
        lb1 = new JLabel("Name:");
        lb2 = new JLabel("Address:");
        
        // Decleartion of JTextField variables
        nameSet = new JTextField(10);
        addressSet = new JTextField(10);

        // Declearation of JButton variables
        btn1 = new JButton("Clear");
        btn2 = new JButton("Exit");

        // Activating the variables
        add(lb1);
        add(nameSet);
        add(lb2);
        add(addressSet);
        add(btn1);
        add(btn2);

        // Clear button listener
        CATest1Handler handler = new CATest1Handler();
        btn1.addActionListener(handler);

        // Exit button listener
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