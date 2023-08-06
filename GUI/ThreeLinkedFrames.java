package GUI;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ThreeLinkedFrames {
    public static void main(String[] args) {
        // Create three JFrame objects
        JFrame frame1 = createFrame("Frame 1", 400, 300);
        JFrame frame2 = createFrame("Frame 2", 400, 300);
        JFrame frame3 = createFrame("Frame 3", 400, 300);

        // Calculate the positions for the second and third frames
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int x1 = frame1.getX();
        int y1 = frame1.getY();
        int x2 = x1 + frame1.getWidth();
        int y2 = y1 + frame1.getHeight();

        int x3 = x2 < screenWidth ? x2 : x1;
        int y3 = y2 < screenHeight ? y2 : y1;

        // Set the positions of the second and third frames
        frame2.setLocation(x2, y2);
        frame3.setLocation(x3, y3);

        // Make the frames visible
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
    }

    private static JFrame createFrame(String title, int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }
}
