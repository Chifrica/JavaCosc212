/*
 * The extended class developed a simple GUI for a telephone handset.
 * Now i will add event-handling code to display typed numbers.
 */

package GUI.LayoutManager.GUI.LayoutManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TelephoneTest extends TestGridLayout implements ActionListener {
    private TextField display;
    public TelephoneTest(){
        Component component[] = getContentPane().getComponents();
        JPanel cancelPanel = (JPanel)component[13];
        JButton cancel = (JButton)cancelPanel.getComponent(0);
        
        for(int i = 0; i < component.length; i++){
            if(component[i] instanceof JButton)
             ((JButton)component[i]).addActionListener(this);
        }
        cancel.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("Cancel"))
            display.setText("");
        else
            display.setText(display.getText()+ae.getActionCommand());
    }

    public static void main(String[] args) {
        new TelephoneTest().setVisible(true);
    }
}
