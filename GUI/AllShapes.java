package GUI;

import java.awt.Graphics;

import javax.swing.JFrame;

public class AllShapes extends JFrame {
    AllShapes(){
        super("All Shapes");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(328, 583);
    }
    
    public static void main(String[] args) {
        new AllShapes();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(100, 20, 200, 100);
        g.drawRect(5, 150, 150, 100);
        g.drawRoundRect(165, 150, 150, 100, 15, 15);
        setTitle(getWidth() + " " + getHeight());
    }
}