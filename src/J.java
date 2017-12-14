import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
public class J extends JFrame {
    public static void main(String argv[]) {
        new J("new window!");
    }
    public J(String title) {
        this.setBounds(0,0,400,300);
        this.setTitle(title);
        this.setVisible(true);
    }
}
*/

public class J implements WindowListener{
    JFrame f;
    public static void main(String argv[]) {
        new J("JFrame 6");
    }
    public J(String title) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        f=new JFrame(title);
        f.setBounds(0,0,400,300);
        f.setVisible(true);
        f.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e) {System.exit(0);}
    public void windowClosed(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
}
