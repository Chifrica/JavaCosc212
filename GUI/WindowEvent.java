package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import java.awt.event.*;

public class WindowEvent extends JFrame{
    private String msg = "Are you sure you want to Quit Window?";

    public WindowEvent(){
        super("Window Event Test");
        setSize(300, 300);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                WindowEvent obj = WindowEvent.this;
                int result = JOptionPane.showConfirmDialog(obj, msg);
                if (result == JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                } else {
                    int keepOpen = WindowConstants.DO_NOTHING_ON_CLOSE;
                    setDefaultCloseOperation(keepOpen);
                }
            }
        });
    }
    public static void main(String[] args) {
        WindowEvent we = new WindowEvent();
        we.setVisible(true);
    }
}
