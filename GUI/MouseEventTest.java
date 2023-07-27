package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseEventTest extends ButtonEventTest {
    
    public MouseEventTest(){
        /* 
        class LightUpListener extends MouseAdapter {

            // MouseEntered method
            public void mouseEntered(MouseEvent e) {
                Component c = (Component) e.getSource();
                c.setBackground(Color.green);
            }

            // MouseExited method
            public void mouseExited(MouseEvent e) {
                Component c = (Component) e.getSource();
                c.setBackground(Color.red);
            }

            // MouseCLicked method
            public void mouseClicked(MouseEvent e){
                Component c = (Component) e.getSource();
                c.setBackground(Color.blue);
            }
            
            // MousePressed method
            public void mousePressed(MouseEvent e){
                Component c = (Component) e.getSource();
                c.setBackground(Color.yellow);
            }

            // MouseReleased method
            public void mouseReleased(MouseEvent e){
                Component c = (Component) e.getSource();
                c.setBackground(Color.gray);
            }
        }
        */

        JFrame frame = new JFrame("Mouse Event Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Button");
        JTextField textField = new JTextField(20);
        JPanel cp = new JPanel();

        cp.setPreferredSize(new Dimension(200, 200));

        frame.add(button);
        frame.add(textField);
        frame.add(cp);

        class LightUpListener extends MouseAdapter{
            public void mouseEntered(MouseEvent e){
                Component c = (Component)e.getSource();
                c.setBackground(Color.red);
            }

            public void mouseExited(MouseEvent e){
                Component c = (Component) e.getSource();
                c.setBackground(Color.green);
            }
        }

        MouseListener listener = new LightUpListener();
        button.addMouseListener(listener);
        textField.addMouseListener(listener);
        cp.addMouseListener(listener);

        // changing frame.setSize() to pack()
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventTest();
    }
}
