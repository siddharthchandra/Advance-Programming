import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class Admin {
    private JLabel head;
    private JButton add;
    private JButton view;
    private JButton delete;
    private JButton assigntask;
    private JButton regrequests;
    private JButton logrequests;
    private JButton taskreport;
    private JPanel panel;
    private JFrame jFrame;
    private JButton logout;
    private JButton leaverequest;
    Admin(ArrayList<LeaveRequest> leaveRequests,ArrayList<LogisticsRequests> logisticsRequestses,ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses)
    {
        jFrame=new JFrame();
        panel=new JPanel();
        head=new JLabel("ADMIN");
        add=new JButton("ADD");
        view=new JButton("VIEW");
        logout=new JButton("Log Out");
        delete=new JButton("DELETE");
        assigntask=new JButton("ASSIGN TASK");
        regrequests=new JButton("REGISTRATION REQUESTS");
        logrequests=new JButton("LOGISTICS REQUESTS");
        taskreport=new JButton("TASK REPORTS");
        leaverequest=new JButton("PENDING LEAVE REQUESTS");
        head.setBounds(580,70,200,50);
        logout.setBounds(1250,50,80,30);
        head.setFont(new Font("Serif", Font.PLAIN, 40));
        jFrame.setSize(1800,1800);
        add.setBounds(550,150,200,50);
        view.setBounds(550,220,200,50);
        delete.setBounds(550,290,200,50);
        assigntask.setBounds(550,360,200,50);
        regrequests.setBounds(550,430,200,50);
        logrequests.setBounds(550,500,200,50);
        taskreport.setBounds(550,570,200,50);
        leaverequest.setBounds(550,650,200,50);
        panel.setLayout(null);
        new ClockPane(panel);
        panel.add(head);
        panel.add(add);
        panel.add(view);
        panel.add(logout);
        panel.add(delete);
        panel.add(assigntask);
        panel.add(regrequests);
        panel.add(logrequests);
        panel.add(taskreport);
        panel.add(leaverequest);
        jFrame.add(panel);
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
        jFrame.setVisible(true);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add(databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
            }
        });
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewDatabase(databases);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1=new JFrame("Delete");
                JPanel jPanel1=new JPanel();
                jPanel1.setLayout(null);
                jFrame1.setSize(400,400);
                JLabel jLabel=new JLabel("Enter Username to be deleted :");
                JTextField jTextField=new JTextField();
                JButton delete1=new JButton("Delete");
                jLabel.setBounds(0,70,220,40);
                jTextField.setBounds(250,70,50,40);
                delete1.setBounds(90,150,80,40);
                jPanel1.add(jLabel);
                jPanel1.add(delete1);
                jPanel1.add(jTextField);
                jFrame1.add(jPanel1);
                jFrame1.setVisible(true);
                delete1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int flag1=0;
                        if(jTextField.getText().length()==0)
                        {
                            flag1=1;
                            JOptionPane.showMessageDialog(jFrame1, "Username field is empty ! ");
                        }

                        int found =0;
                        String s=jTextField.getText().toString();
                        int flag=0;
                        for(Database i:databases)
                        {
                            if(i.getUsername().equals(s)) {
                                databases.remove(i);
                                flag=1;
                                break;
                            }
                        }
                        if(flag==1)
                        {
                            jFrame1.setVisible(false);
                            JOptionPane.showMessageDialog(jFrame1, "Deleted ! ");
                        }
                        else if(flag==0 && flag1==0)
                        {
                            JOptionPane.showMessageDialog(jFrame1, "Username Not Found ! ");
                        }
                    }
                });
            }
        });
        assigntask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AssignTask(assignTasks);
            }
        });
        regrequests.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(registrationRequestses.size());
                new RegistrationRequestsView(registrationRequestses,databases,electricityStaffs,audioVideoStaffs,departmentSupervisorses,housekeepingStaffs,hvacStaffs,securityStaffs);
            }
        });
        logrequests.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new LogisticsRequestsView(logisticsRequestses, databases,electricityStaffs,audioVideoStaffs,departmentSupervisorses,housekeepingStaffs,hvacStaffs,securityStaffs);
            }
        });
        taskreport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Update(logisticsRequestses,leaveRequests,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                jFrame.setVisible(false);
                new Main();
            }
        });
        leaverequest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LeaveRequestsView(leaveRequests);
            }
        });

    }
}