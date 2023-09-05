import java.awt.*;
import java.awt.event;
import java.swing.*;

public class Calculator extends JFrame{
    private JTextField box;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnAdd;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSubtract;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnMultiply;
    private JButton btnDivision;
    private JButton btnZero;
    private JButton btnEqual;

    public Calculator(){
        super("Calculator");
        setLocation(200, 200);
        setLayout(new FlowLayout());
        setSize(400, 250);
        setVisible(true);
    }
}