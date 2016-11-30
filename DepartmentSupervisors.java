import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class DepartmentSupervisors {
    private String Username;
    private String Name;
    private String Password;
    private String UniqueID;
    private String Department;
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
    private JButton sendleave;
        DepartmentSupervisors(String Name,String Username,String Password,String UniqueID,String Department)
        {
            this.UniqueID=UniqueID;
            this.Name=Name;
            this.Password=Password;
            this.Department=Department;
            this.Username=Username;
        }
        DepartmentSupervisors(ArrayList<LeaveRequest> leaveRequests,ArrayList<LogisticsRequests> logisticsRequestses,ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses,String DepartmentSelected)
        {
            jFrame=new JFrame();
            panel=new JPanel();
            head=new JLabel(DepartmentSelected+" Supervisor");
            add=new JButton("ADD");
            view=new JButton("VIEW");
            logout=new JButton("Log Out");
            delete=new JButton("DELETE");
            assigntask=new JButton("ASSIGN TASK");
            regrequests=new JButton("REGISTRATION REQUESTS");
            logrequests=new JButton("LOGISTICS REQUESTS");
            taskreport=new JButton("TASK REPORTS");
            leaverequest=new JButton("PENDING LEAVE REQUESTS");
            sendleave=new JButton("APPLY FOR A LEAVE");
            head.setBounds(580,50,200,50);
            logout.setBounds(1250,50,80,30);
            head.setFont(new Font("Serif", Font.PLAIN, 40));
            jFrame.setSize(1800,1800);
            add.setBounds(550,100,200,30);
            view.setBounds(550,150,200,30);
            delete.setBounds(550,200,200,30);
            assigntask.setBounds(550,250,200,30);
            regrequests.setBounds(550,400,200,30);
            logrequests.setBounds(550,450,200,30);
            taskreport.setBounds(550,500,200,30);
            leaverequest.setBounds(550,550,200,30);
            sendleave.setBounds(550,600,200,30);
            panel.setLayout(null);
            new ClockPane(panel);
            panel.add(head);
            panel.add(sendleave);
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
            //System.out.print(DepartmentSelected);
            for(AudioVideoStaff i:audioVideoStaffs)
                System.out.print(i.getName()) ;
            add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new AddStaff(databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,DepartmentSelected);
                }
            });
            view.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(DepartmentSelected.equals("Electricity"))
                    new ViewElectricityStaff(electricityStaffs);
                    else if(DepartmentSelected.equals("HVAC"))
                        new ViewHVACStaff(hvacStaffs);
                    else if(DepartmentSelected.equals("Audio-Video"))
                        new ViewAudioVideoStaff(audioVideoStaffs);
                    else if(DepartmentSelected.equals("Security"))
                        new ViewSecurityStaff(securityStaffs);
                    else if(DepartmentSelected.equals("Housekeeping"))
                        new ViewHousekeepingStaff(housekeepingStaffs);

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
                            if(DepartmentSelected.equals("Electricity"))
                            {
                                for(ElectricityStaff i:electricityStaffs)
                                {
                                    if(i.getUsername().equals(s)) {
                                        electricityStaffs.remove(i);
                                        flag=1;
                                        break;
                                    }
                                }
                            }
                            else if(DepartmentSelected.equals("HVAC"))
                            {
                                for(HVACStaff i:hvacStaffs)
                                {
                                    if(i.getUsername().equals(s)) {
                                        hvacStaffs.remove(i);
                                        flag=1;
                                        break;
                                    }
                                }
                            }
                            else if(DepartmentSelected.equals("Audio-Video"))
                            {
                                for(AudioVideoStaff i:audioVideoStaffs)
                                {
                                    if(i.getUsername().equals(s)) {
                                        audioVideoStaffs.remove(i);
                                        flag=1;
                                        break;
                                    }
                                }
                            }
                            else if(DepartmentSelected.equals("Security"))
                            {
                                for(SecurityStaff i:securityStaffs)
                                {
                                    if(i.getUsername().equals(s)) {
                                        securityStaffs.remove(i);
                                        flag=1;
                                        break;
                                    }
                                }
                            }
                            else if(DepartmentSelected.equals("Housekeeping"))
                            {
                                for(HousekeepingStaff i:housekeepingStaffs)
                                {
                                    if(i.getUsername().equals(s)) {
                                        housekeepingStaffs.remove(i);
                                        flag=1;
                                        break;
                                    }
                                }
                            }

                            if(flag==1)
                            {
                                jFrame1.setVisible(false);
                                JOptionPane.showMessageDialog(jFrame1, "Deleted ! ");
                            }
                            else if(flag==0 && flag1==0)
                            {
                                JOptionPane.showMessageDialog(jFrame1, "Username Not Found in your Department ! ");
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
            sendleave.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }
        public String getUsername()
        {
            return this.Username;
        }
        public String getName()
        {
            return this.Name;
        }
        public String getPassword()
        {
            return this.Password;
        }
        public String getUniqueID()
        {
            return this.UniqueID;
        }
        public String getDepartment()
        {
            return this.Department;
        }
        public void setUsername(String Username) {this.Username=Username;}
        public void setName(String Name)
        {
            this.Name=Name;
        }
        public void setPassword(String Password)
        {
            this.Password=Password;
        }
        public void setUniqueID(String UniqueID)
        {
            this.UniqueID=UniqueID;
        }
        public void setDepartment(String Department)
        {
            this.Department=Department;
        }
}
