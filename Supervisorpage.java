
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by prasoon on 12/11/16.
 */
public class Supervisorpage {
    private JFrame jFrame;
    private JPanel jPanel;
    private JButton jButton;
    private JLabel jLabel;

    public Supervisorpage () {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Welcome Supervisor");
        JButton home = new JButton("Home");
        JButton staff = new JButton("View Staff");
        JButton logistics = new JButton("Logistics");
        JButton reports = new JButton("Reports");
        JButton requests = new JButton("Pending Requests");
        JButton logout=new JButton("LogOut");
        GridBagConstraints c = new GridBagConstraints();
        home.setPreferredSize(home.getPreferredSize());
        staff.setPreferredSize(staff.getPreferredSize());
        logistics.setPreferredSize(logistics.getPreferredSize());
        reports.setPreferredSize(reports.getPreferredSize());
        requests.setPreferredSize(requests.getPreferredSize());
        logout.setPreferredSize(logout.getPreferredSize());
        label.setPreferredSize(label.getPreferredSize());
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 0, 10, 0);
        panel.add(label,c);
        c.gridy++;
        c.gridy++;
        c.gridy++;
        c.gridx--;
        c.gridx--;
        panel.add(home,c);
        c.gridx++;
        panel.add(staff,c);
        c.gridx++;
        panel.add(logistics,c);
        c.gridx++;
        panel.add(reports,c);
        c.gridx++;
        panel.add(logout,c);
        frame.setSize(700,600);
        frame.add(panel,BorderLayout.PAGE_START);
        frame.setVisible(true);
        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        staff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        logistics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        reports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        requests.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });


    }
}