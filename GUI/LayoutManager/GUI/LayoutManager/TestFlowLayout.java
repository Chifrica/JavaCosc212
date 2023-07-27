package GUI.LayoutManager.GUI.LayoutManager;

import javax.swing.*;

class TestFlowLayout extends JFrame{

    // Creating JPanel objects
    JPanel panel = new JPanel();

    // Constructor
    public TestFlowLayout(){
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));

        setContentPane(panel);
        setSize(300, 300);
        setTitle("Flow Layout");
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new TestFlowLayout();
    }
}
