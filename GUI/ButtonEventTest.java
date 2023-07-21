package GUI;

// Button Event

import java.awt.*;
import java.awt.event.*;

public class ButtonEventTest extends AddingComponents implements ActionListener{
  
    // Instance variable
    private int sum;
    
    // Constructor
    public ButtonEventTest(){
        button.addActionListener(this);
    }

    // ActionPerformed method
    public void actionPerformed(ActionEvent ae){
        sum += 1;
        textField.setText(sum + "");
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main (String[] args){
        new ButtonEventTest();
    }
}
