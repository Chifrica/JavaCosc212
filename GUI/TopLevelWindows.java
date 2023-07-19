package GUI;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;

public class TopLevelWindows {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Jframe");
        frame.setLocation(100, 100);
        frame.setSize(300, 300);

        Container fcp = frame.getContentPane();
        JButton fb = new JButton("Draggable, Resizible frame");
        fcp.add(fb);

        JWindow window = new JWindow();
        window.setLocation(500, 100);
        window.setSize(300, 300);

        Container wcp = window.getContentPane();
        JButton fbb = new JButton("Unmovabe, No Frills WIndows");
        wcp.add(fbb);

        frame.setVisible(true);
        window.setVisible(true);
    }
}
