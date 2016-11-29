import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Siddharth on 11/29/2016.
 */
public class LogisticsRequestsView {
    private JFrame jFrame;
    private JPanel jPanel;
    private ArrayList<AudioVideoStaff> audioVideoStaffs;
    private ArrayList<HousekeepingStaff> housekeepingStaffs;
    private ArrayList<SecurityStaff> securityStaffs;
    private ArrayList<HVACStaff> hvacStaffs;
    private ArrayList<ElectricityStaff> electricityStaffs;
    private ArrayList<DepartmentSupervisors> departmentSupervisorses;
    private ArrayList<Database> databases;
    LogisticsRequestsView(ArrayList<LogisticsRequests> logisticsRequestses, ArrayList<Database> databases, ArrayList<ElectricityStaff> electricityStaffs, ArrayList<AudioVideoStaff>audioVideoStaffs, ArrayList<DepartmentSupervisors> departmentSupervisorses, ArrayList<HousekeepingStaff> housekeepingStaffs, ArrayList<HVACStaff> hvacStaffs, ArrayList<SecurityStaff> securityStaffs)
    {
        jFrame = new JFrame();
        jPanel = new JPanel();
        audioVideoStaffs = new ArrayList<AudioVideoStaff>();
        housekeepingStaffs = new ArrayList<HousekeepingStaff>();
        securityStaffs = new ArrayList<SecurityStaff>();
        hvacStaffs = new ArrayList<HVACStaff>();
        electricityStaffs = new ArrayList<ElectricityStaff>();
        departmentSupervisorses=new ArrayList<DepartmentSupervisors>();
        databases=new ArrayList<Database>();
//        JScrollPane listScroller = new JScrollPane(jPanel);
//        listScroller.setPreferredSize(new Dimension(250, 80));
//        listScroller.setAlignmentX(LEFT_ALIGNMENT);
        jFrame.setSize(400, 400);
        int c = 0;
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

        //System.out.println(registrationRequestses.size());
        if(logisticsRequestses.size()==1)
        {
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new FlowLayout());
            jPanel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            JLabel norequest=new JLabel("Yipee!! No pending Logistics Requests.");
            jPanel1.add(norequest);
            jPanel.add(jPanel1);
        }
        else{
            for (LogisticsRequests i:logisticsRequestses) {
                if(c>0) {
                    JPanel jPanel2 = new JPanel();
                    jPanel2.setLayout(new FlowLayout());
                    jPanel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                    JLabel serial1 = new JLabel(Integer.toString(c++));
                    JLabel name1 = new JLabel(i.getUsername());
                    JLabel department1 = new JLabel(i.getDepartment());
                    JLabel material = new JLabel(i.getMaterialsNeeded());
                    JButton approve1 = new JButton("Approve");
                    JButton reject1 = new JButton("Reject");
                    jPanel2.add(serial1);
                    jPanel2.add(name1);
                    jPanel2.add(department1);
                    jPanel2.add(material);
                    jPanel2.add(approve1);
                    jPanel2.add(reject1);
                    jPanel.add(jPanel2);
                    approve1.addActionListener(new LogisticsRequestsView.ApproveButtonListener(i, logisticsRequestses, databases, electricityStaffs, audioVideoStaffs, departmentSupervisorses, housekeepingStaffs, hvacStaffs, securityStaffs));
                    reject1.addActionListener(new LogisticsRequestsView.RejectButtonListener(i, logisticsRequestses));
                }
                else
                    c++;
            }
        }
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

    class ApproveButtonListener implements ActionListener {
        LogisticsRequests requests;
        ArrayList<LogisticsRequests> fullarray;
        ArrayList<AudioVideoStaff> audioVideoStaffs;
        ArrayList<HousekeepingStaff> housekeepingStaffs;
        ArrayList<SecurityStaff> securityStaffs;
        ArrayList<HVACStaff> hvacStaffs;
        ArrayList<ElectricityStaff> electricityStaffs;
        ArrayList<DepartmentSupervisors> departmentSupervisorses;
        ArrayList<Database> databases;
        ApproveButtonListener(LogisticsRequests logisticsRequests,ArrayList<LogisticsRequests> fullarray,ArrayList<Database> databases,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<AudioVideoStaff>audioVideoStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs) {
            this.requests = logisticsRequests;
            this.fullarray=fullarray;
            this.audioVideoStaffs=audioVideoStaffs;
            this.housekeepingStaffs=housekeepingStaffs;
            this.securityStaffs=securityStaffs;
            this.hvacStaffs=hvacStaffs;
            this.electricityStaffs=electricityStaffs;
            this.departmentSupervisorses=departmentSupervisorses;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for(LogisticsRequests i:fullarray)
            {

                if(i.getUsername().equals(requests.getUsername())) {
                    fullarray.remove(i);
                    break;
                }
            }
            jFrame.setVisible(false);
            new LogisticsRequestsView(fullarray,databases,electricityStaffs,audioVideoStaffs,departmentSupervisorses,housekeepingStaffs,hvacStaffs,securityStaffs);

        }
    }
    class RejectButtonListener implements ActionListener {
        LogisticsRequests requests;
        ArrayList<LogisticsRequests> fullarray;

        RejectButtonListener(LogisticsRequests registrationRequests,ArrayList<LogisticsRequests> fullarray) {
            this.requests = registrationRequests;
            this.fullarray=fullarray;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            for(LogisticsRequests i:fullarray)
            {
                if(i.getUsername().equals(requests.getUsername())) {
                    fullarray.remove(i);
                    break;
                }
            }
            jFrame.setVisible(false);
            new LogisticsRequestsView(fullarray,databases,electricityStaffs,audioVideoStaffs,departmentSupervisorses,housekeepingStaffs,hvacStaffs,securityStaffs);
        }
    }
    }

