import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class Login {
    private JLabel username;
    private JLabel password;
    private JLabel head;
    private JTextField userfield;
    private JPasswordField passfield;
    private JPanel jPanel;
    private JButton login;
    private String userentered;
    private String passwordentered;
    Login(ArrayList<LeaveRequest> leaveRequests,ArrayList<LogisticsRequests> logisticsRequestses,ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,JFrame jFrame, ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses)
    {
        jFrame.setSize(1800,1800);
        username=new JLabel("Username :");
        password=new JLabel("Password :");
        userfield=new JTextField();
        head=new JLabel("Login");
        passfield=new JPasswordField();
        jPanel=new JPanel();
        jPanel.setLayout(null);
        login=new JButton("Login");
        head.setFont(new Font("Serif", Font.PLAIN, 150));
        jPanel.setBounds(0,0,1800,1800);
        username.setBounds(500,350,100,50);
        userfield.setBounds(580,350,100,30);
        password.setBounds(500,450,100,50);
        passfield.setBounds(580,450,100,30);
        head.setBounds(500,70,400,200);
        login.setBounds(580,550,80,40);
        new ClockPane(jPanel);
        jPanel.add(userfield);
        jPanel.add(passfield);
        jPanel.add(username);
        jPanel.add(head);
        jPanel.add(login);
        jPanel.add(password);
        jFrame.add(jPanel);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userentered=userfield.getText().toString();
                passwordentered=new String(passfield.getPassword());
                JFrame jf1 = new JFrame("ERROR !");
                jf1.setSize(401, 401);
                //System.out.print(databases.size());
                jf1.setDefaultCloseOperation(jf1.EXIT_ON_CLOSE);
                if (userentered.length()==0){ JOptionPane.showMessageDialog(jf1, "Username field is empty ! ");}
                else if(passwordentered.length()==0){JOptionPane.showMessageDialog(jf1, "Password field is empty !");}
                else
                {

                    int flag=0;
                    int flag2=0;
                    for(int i=0;i<databases.size() && flag==0;i++) {
                        if(databases.get(i).getUsername().equals(userentered) ) {
                            flag=1;
                            if (databases.get(i).getPassword().equals(passwordentered)) {
                                flag2=1;
                                JOptionPane.showMessageDialog(jf1, "Login Successfull !");
                                jFrame.setVisible(false);
                                jFrame.remove(jPanel);
                                String dep = databases.get(i).getDepartment();
                               // System.out.println(dep+" "+databases.get(i).getPost());

                                if (dep.equals("Admin")) {
                                  // System.out.print(registrationRequestses.size());
                                    new Admin(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                                }
                                else if (dep.equals("Housekeeping") && databases.get(i).getPost().equals("Staff"))
                                {
                                    new HousekeepingStaff(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);

                                } else if (dep.equals("Security") && databases.get(i).getPost().equals("Staff"))
                                {
                                    new SecurityStaff(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                                }
                                else if (dep.equals("Audio-Video") && databases.get(i).getPost().equals("Staff"))
                                {

                                    new AudioVideoStaff(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                                }
                                else if (dep.equals("Electricity")&& databases.get(i).getPost().equals("Staff"))
                                {
                                    new ElectricityStaff(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                                } else if (dep.equals("HVAC")&& databases.get(i).getPost().equals("Staff"))
                                {
                                    new HVACStaff(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                                }
                                else if(databases.get(i).getPost().equals("Supervisor"))
                                {
                                    new DepartmentSupervisors(leaveRequests,logisticsRequestses,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses,databases.get(i).getDepartment().toString());
                                }

                            }
                            else if (flag2==0 && flag==1)
                            {
                                JOptionPane.showMessageDialog(jf1, " Incorrect Password!");
                            }
                        }

                    }
                    if(flag==0)
                    {
                        JOptionPane.showMessageDialog(jf1, "Incorrect Username !");
                    }

                }
            }
        });
    }
}
