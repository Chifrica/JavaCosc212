package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestingCup extends JFrame{
    CupComponent cc = new CupComponent();

    public TestingCup(){
        super("Resize me");
        add(cc);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestingCup();
    }
}