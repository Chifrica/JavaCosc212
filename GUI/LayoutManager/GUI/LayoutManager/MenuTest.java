/*
 * I demonstrate how menus, separator, mnemonic and accelerators can be added into an application.
 */

package GUI.LayoutManager.GUI.LayoutManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MenuTest extends JFrame{
    private JMenuBar menuBar = new JMenuBar();
    protected JMenu filemMenu = new JMenu("File");
    protected JMenuItem neW, open, quit, save, print;
    private JMenuItem saveCurrent, saveAs, saveAll;

    MenuTest(String title){
        super(title);

        setJMenuBar(menuBar);
        menuBar.add(filemMenu);
        filemMenu.setMnemonic('F');
        filemMenu.add(neW = new JMenuItem("New"));
        filemMenu.add(open = new JMenuItem("Open"));
        open.setMnemonic(0);
        filemMenu.add(save = new JMenuItem("Save"));

        save.add(saveAs = new JMenuItem("Save As"));
        save.add(saveAll = new JMenuItem("Save All"));
        save.add(saveCurrent = new JMenuItem("Save Current"));

        filemMenu.add(save);
        filemMenu.add(print = new JCheckBoxMenuItem("Print" ));
        filemMenu.addSeparator();
        filemMenu.add(quit = new JMenuItem("Quit"));
        quit.setMnemonic(KeyEvent.VK_Q);
        quit.setAccelerator(
            KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK)
        );
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int result = JOptionPane.showConfirmDialog(MenuTest.this, 
                    "Quit/Close Menu Demos Window?"
                );
                if(result == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        setSize(300, 300);
    }

    public static void main(String[] args) {
        MenuTest t = new MenuTest("Menus Test");
        t.setVisible(true);
    }
}
