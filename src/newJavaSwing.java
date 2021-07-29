import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newJavaSwing {
    private JPanel rootPanel;
    private JLabel lbl1;
    private JTextField txtfield1;
    private JButton btn1;
    private JLabel lbl2;

    public newJavaSwing() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String greeting = "hello! "+txtfield1.getText();
                lbl2.setText(greeting);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("newJavaSwing");
        frame.setContentPane(new newJavaSwing().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
