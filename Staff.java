/**
 * Created by prasoon on 29/11/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class Staff {
    private JLabel head;
    private JButton Logreq;
    private JButton SendLeave;
    private JButton UpdateStatus;
    private JButton GenerateReport;
    //private JButton regrequests;
    //private JButton logrequests;
    //private JButton taskreport;
    private JPanel panel;
    private JFrame jFrame;
    private JButton logout;
    Staff()//ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses)
    {
        jFrame=new JFrame();
        panel=new JPanel();

        head=new JLabel("Staff of ");
        Logreq=new JButton("Request Logistics");
        SendLeave=new JButton("Send Leave");
        logout=new JButton("Log Out");
        UpdateStatus=new JButton("Update Satus");
        GenerateReport=new JButton("Generate Task Report");
        /*regrequests=new JButton("REGISTRATION REQUESTS");
        logrequests=new JButton("LOGISTICS REQUESTS");
        taskreport=new JButton("TASK REPORTS");*/
        head.setBounds(580,70,200,50);
        logout.setBounds(1250,50,80,30);
        head.setFont(new Font("Serif", Font.PLAIN, 40));
        jFrame.setSize(1800,1800);
        Logreq.setBounds(550,150,200,50);
        SendLeave.setBounds(550,220,200,50);
        UpdateStatus.setBounds(550,290,200,50);
        GenerateReport.setBounds(550,360,200,50);
        //regrequests.setBounds(550,430,200,50);
        //logrequests.setBounds(550,500,200,50);
        //taskreport.setBounds(550,570,200,50);
        panel.setLayout(null);
        new ClockPane(panel);
        panel.add(head);
        panel.add(Logreq);
        panel.add(SendLeave);
        panel.add(logout);
        panel.add(UpdateStatus);
        panel.add(GenerateReport);
        //panel.add(regrequests);
        //panel.add(logrequests);
        ///panel.add(taskreport);
        jFrame.add(panel);
    //    jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
        jFrame.setVisible(true);

    }
}
