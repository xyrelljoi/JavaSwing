import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing {
    private JPanel rootPanel;
    private JLabel lbl2;
    private JLabel lbl1;
    private JButton btn1;
    private JTextField txtfield1;


    public JavaSwing() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String greeting = "HATDOG "+ txtfield1.getText();
                lbl1.setText(greeting);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaSwing");
        frame.setContentPane(new JavaSwing().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
