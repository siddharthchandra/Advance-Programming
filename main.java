import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by prasoon on 12/11/16.
 */
public class main {
    private JFrame jFrame;
    private JPanel jPanel;
    private JButton jButton;
    private JLabel jLabel;
public static void main(String[] args){
    JFrame jFrame=new JFrame();
    JPanel jPanel=new JPanel(new GridBagLayout());
    JButton jButton=new JButton("LOGIN");
    JButton jButton1=new JButton("REGISTER");
    JButton exit=new JButton("EXIT");
    JLabel jLabel=new JLabel("Welcome to Facility Management System Of IIITD");
    GridBagConstraints c=new GridBagConstraints();
    jButton.setPreferredSize(jButton.getPreferredSize());
    jButton1.setPreferredSize(jButton1.getPreferredSize());
    exit.setPreferredSize(exit.getPreferredSize());
    jLabel.setPreferredSize(jLabel.getPreferredSize());
    c.gridx=0;
    c.gridy=0;
    c.insets=new Insets(10,0,10,0);


    jPanel.add(jLabel,c);
    c.insets=new Insets(50,0,50,0);
    c.gridy++;
    c.gridy++;
    jPanel.add(jButton,c);
    c.gridy++;
    jPanel.add(jButton1,c);
    c.gridx--;
    c.gridx--;
    c.gridy++;
    jPanel.add(exit,c);
    jFrame.add(jPanel,BorderLayout.PAGE_START);
    jFrame.setVisible(true);

    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    });
    jButton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    });
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    });

}





}
