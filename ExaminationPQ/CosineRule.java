import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CosineRule extends JFrame{
    private JLabel firstSideLabel;
    private JLabel secondSideLabel;
    private JLabel includedAngleLabel;
    private JLabel otherSideLabel;

    private JTextField firstSide;
    private JTextField secondSide;
    private JTextField includedAngle;
    private JTextField otherSide;

    private JButton go;

    public CosineRule(){
        super("Cosine Rule");
        setLayout(new FlowLayout());
        setSize(300, 150);
        setResizable(false);

        firstSideLabel = new JLabel("Side AB:");
        secondSideLabel = new JLabel("Side AC:");
        includedAngleLabel = new JLabel("Angle BAC:");
        otherSideLabel = new JLabel("Side BC:");

        firstSide = new JTextField(5);
        secondSide = new JTextField(5);
        includedAngle = new JTextField(5);
        otherSide = new JTextField(5);
        otherSide.setEditable(false);

        go = new JButton("Go");

        add(firstSideLabel);
        add(firstSide);
        add(secondSideLabel);
        add(secondSide);
        add(includedAngleLabel);
        add(includedAngle);
        add(otherSideLabel);
        add(otherSide);

        add(go);

        Handler handler = new Handler();
        go.addActionListener(handler);
        //end of constructor
    }

    // Inner class
    private class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double AB = Double.parseDouble(
                firstSide.getText()
            );

            double AC = Double.parseDouble(
                secondSide.getText()
            );

            double A = Double.parseDouble(
                includedAngle.getText()
            );

            A = A * Math.PI /180.0;
            
            double BC = Math.sqrt(AB * AB + AC * AC -
                2 * AB * AC * Math.cos(A)
            );

            String thirdSide = String.format("%.2f", BC);
            otherSide.setText(thirdSide);
        }//end of actionPerformed()
    }//end of class Handler
}