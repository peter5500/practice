import javax.swing.*;
import java.awt.*;

public class test extends JFrame{
    JTextField jtf= null;
    JPanel jp = null;
    JComboBox jcb = null;
    JButton jb = null;
    JTextArea jta = null;
    JScrollPane jsp = null;

    public static void main(String[] args) {
        test test = new test();
    }
    public test(){

        jtf = new JTextField(10);
        jp = new JPanel();
        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        String[] chatter = {"你好","早安","晚安"};
        jcb = new JComboBox(chatter);
        jb =  new JButton("啟動");

        jp.add(jcb);
        jp.add(jtf);
        jp.add(jb);

        this.add(jsp);
        this.add(jp, BorderLayout.SOUTH);
        this.setLocation(200,300);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MSN");
        this.setVisible(true);



    }

}
