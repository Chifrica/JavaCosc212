package GUI;

import javax.swing.*;

public class KeyBoardEvent extends JApplet implements KeyListener {
    private String msg = "";
    private int startX = 10, startY = 10;

    public void keyPressed(KeyEvent ke){
        showStatus("KeyDown");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        repaint();
    }

    public void init(){
        requestFocus();
        addKeyListener(this);
    }

    public void paint(Graphics g){
        g.drawString (msg, startX, startY);
    }

    public static void main(String[] args) {
        
    }
}
