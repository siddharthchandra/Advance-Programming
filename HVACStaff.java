import javax.swing.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class HVACStaff {
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    private JLabel head;
    private JButton Logreq;
    private JButton SendLeave;
    private JButton UpdateStatus;
    private JButton GenerateReport;
    private JPanel panel;
    private JFrame jFrame;
    private JButton logout;
  HVACStaff(ArrayList<LeaveRequest> leaveRequests,ArrayList<LogisticsRequests> logisticsRequestses,ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses)
    {
            jFrame=new JFrame();
            panel=new JPanel();

            head=new JLabel("HVAC Staff");
            Logreq=new JButton("Request Logistics");
            SendLeave=new JButton("Send Leave");
            logout=new JButton("Log Out");
            UpdateStatus=new JButton("Update Satus");
            GenerateReport=new JButton("Generate Task Report");
            head.setBounds(500,70,500,50);
            logout.setBounds(1250,50,80,30);
            head.setFont(new Font("Serif", Font.PLAIN, 40));
            jFrame.setSize(1800,1800);
            Logreq.setBounds(550,150,200,50);
            SendLeave.setBounds(550,220,200,50);
            UpdateStatus.setBounds(550,290,200,50);
            GenerateReport.setBounds(550,360,200,50);
            panel.setLayout(null);
            new ClockPane(panel);
            panel.add(head);
            panel.add(Logreq);
            panel.add(SendLeave);
            panel.add(logout);
            panel.add(UpdateStatus);
            panel.add(GenerateReport);
            jFrame.add(panel);
            jFrame.setVisible(true);
            Logreq.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    JFrame jFrame = new JFrame();
                    JButton submit = new JButton("Request");
                    jFrame.setSize(1800, 1800);
                    JPanel panel1 = new JPanel();
                    panel1.setLayout(null);

                    JTextField userfield = new JTextField();
                    JTextField material=new JTextField();
                    panel.setBounds(0, 0, 1800, 1800);

                    head = new JLabel("Request Logistics");
                    JLabel Material=new JLabel("Materials Required");
                    JLabel Username = new JLabel("Username :");

                    JLabel Type = new JLabel("Type :");

                    JLabel Department = new JLabel("Department");

                    head.setBounds(550, 70, 600, 50);
                    head.setFont(new Font("Serif", Font.PLAIN, 40));
                    Username.setBounds(200, 150, 120, 30);
                    userfield.setBounds(350, 150, 150, 30);
                    Material.setBounds(200,200,150,30);
                    material.setBounds(350,200,200,30);
                    Department.setBounds(200, 250, 120, 30);
                    String[] departmentmenu = new String[]{"Electricity", "Housekeeping", "Security", "HVAC", "Audio-Video"};
                    JComboBox<String> departmentList = new JComboBox<>(departmentmenu);
                    departmentList.setBounds(350, 250, 150, 30);

                    Type.setBounds(200, 300, 80, 30);
                    String[] typemenu = new String[]{"Supervisor", "Staff"};
                    JComboBox<String> typeList = new JComboBox<>(typemenu);
                    typeList.setBounds(350, 300, 120, 30);
                    submit.setBounds(600, 500, 100, 50);
                    panel1.add(head);
                    panel1.add(userfield);

                    panel1.add(Department);
                    panel1.add(departmentList);
                    panel1.add(Material);
                    panel1.add(material);
                    panel1.add(Type);
                    panel1.add(typeList);

                    new ClockPane(panel1);
                    panel1.add(Username);
                    panel1.add(submit);
                    jFrame.add(panel1);
                    jFrame.setResizable(false);
                    jFrame.setVisible(true);

                    submit.addActionListener(new ActionListener() {
                        @Override
                                      if(userfield.getText().length()==0 && flag1==0)
                {
                    flag1=1;
                    JOptionPane.showMessageDialog(jf1, "Enter your Username !");
                }             if(material.getText().length()==0 && flag==0)
                {
                    flag=1;
                    JOptionPane.showMessageDialog(jf1, "Enter materials !");
                }
                        public void actionPerformed(ActionEvent e) {
                            logisticsRequestses.add(new LogisticsRequests(userfield.getText().toString(),departmentList.getSelectedItem().toString(),material.getText().toString(),typeList.getSelectedItem().toString()));
                            jFrame.setVisible(false);

                        }
                    });
                }

            });

        SendLeave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1=new JFrame("Leave");
                JPanel jPanel=new JPanel();
                jPanel.setLayout(null);
                JLabel from=new JLabel("From :");
                JLabel till=new JLabel("Till :");
                JLabel reason=new JLabel("Reason");
                JLabel username=new JLabel("Username");
                JLabel department=new JLabel("Department");
                JLabel type=new JLabel("Post");
                JTextField fromfield=new JTextField();
                JTextField tillfield=new JTextField();
                JTextField reasonfield=new JTextField();
                JTextField userfield=new JTextField();
                JLabel head=new JLabel("Leave Request !");
                jFrame1.setSize(500,500);
                head.setBounds(150,30,100,30);
                from.setBounds(100,100,50,30);
                till.setBounds(100,150,50,30);
                reason.setBounds(100,200,50,30);
                fromfield.setBounds(170,100,50,30);
                tillfield.setBounds(170,150,50,30);
                reasonfield.setBounds(170,200,100,30);
                JButton request=new JButton("Request ");
                request.setBounds(250,400,120,50);
                username.setBounds(170,250,50,30);
                userfield.setBounds(220,250,50,30);
                department.setBounds(100,250,100,30);
                String[] departmentmenu = new String[] {"Electricity","Housekeeping","Security","HVAC","Audio-Video"};
                JComboBox<String> departmentList = new JComboBox<>(departmentmenu);
                departmentList.setBounds(250,250,100,30);
                String[] typemenu = new String[] {"Supervisor","Staff"};
                JComboBox<String> typeList = new JComboBox<>(typemenu);
                typeList.setBounds(250,300,100,30);
                type.setBounds(100,300,100,30);
                jPanel.add(head);
                jPanel.add(department);
                jPanel.add(departmentList);
                jPanel.add(type);
                jPanel.add(typeList);
                jPanel.add(from);
                jPanel.add(till);
                jPanel.add(reason);
                jPanel.add(fromfield);
                jPanel.add(tillfield);
                jPanel.add(reasonfield);
                jPanel.add(request);
                jFrame1.add(jPanel);
                jFrame1.setVisible(true);
                request.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.print("old="+leaveRequests.size());
                        leaveRequests.add(new LeaveRequest(fromfield.getText().toString(),tillfield.getText().toString(),reasonfield.getText().toString(),userfield.getText().toString(),departmentList.getSelectedItem().toString(),typeList.getSelectedItem().toString()));
                        System.out.print("new="+leaveRequests.size()+"user="+leaveRequests.get(1).getUsername());
                        jFrame1.setVisible(false);
                    }
                });
            }
        });
        UpdateStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        GenerateReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Update(leaveRequests,assignTasks,registrationRequestses,databases,audioVideoStaffs,electricityStaffs,housekeepingStaffs,hvacStaffs,securityStaffs,departmentSupervisorses);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                jFrame.setVisible(false);
                new Main();

            }
        });
        }

    HVACStaff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
        this.Name= Name;
        this.Username= Username;
        this.Password=Password;
        this.UniqueID=UniqueID;
        this.Status=Status;
        this.TillWhen=TillWhen;
        this.TaskStatus=TaskStatus;
        //super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
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
    public  String getStatus()
    {
        return this.Status;
    }
    public String getTillWhen()
    {
        return this.TillWhen;
    }
    public String getTaskStatus()
    {
        return this.TaskStatus;
    }
    public void setUsername(String Username)
    {
        this.Username=Username;
    }
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
    public void setStatus(String Status)
    {
        this.Status=Status;
    }
    public void setTillWhen(String TillWhen)
    {
        this.TillWhen=TillWhen;
    }
    public void setTaskStatus(String TaskStatus)
    {
        this.TaskStatus=TaskStatus;
    }
}
