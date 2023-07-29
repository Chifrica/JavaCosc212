package GUI.LayoutManager.GUI.LayoutManager;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;

public class FileDialogTest extends MenuTest {
    JEditorPane texPane = new JEditorPane();
    FileDialogTest(String title){
        super(title);
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                FileDialog fd = new FileDialog(FileDialogTest.this);
                fd.setVisible(true);
                texPane.setText("Selected file: " + fd.getFile());
            }
        });
        getContentPane().add(texPane);
    }
    public static void main(String[] args) {
        FileDialogTest t = new FileDialogTest("File Dialog Test");
        t.setVisible(true);
    }
}
