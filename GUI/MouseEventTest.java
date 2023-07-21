package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest extends ButtonEventTest {
    
    public MouseEventTest(){
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

        MouseListener listener = new LightUpListener();
        button.addMouseListener(listener);
        textField.addMouseListener(listener);
        cp.addMouseListener(listener);
    }

    public static void main(String[] args) {
        new MouseEventTest();
    }
}
