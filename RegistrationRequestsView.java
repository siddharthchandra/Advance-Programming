import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class RegistrationRequestsView {
    private JFrame jFrame;
    private JPanel jPanel;
    private String departmentselected;
    private String usernameentered;
    private String nameentered;
    private String addressentered;
    private String passwordenterd;
    private String dateentered;
    private String typeselected;
    private String genderentered;
    private String uniqueID;
    private ArrayList<AudioVideoStaff> audioVideoStaffs;
    private ArrayList<HousekeepingStaff> housekeepingStaffs;
    private ArrayList<SecurityStaff> securityStaffs;
    private ArrayList<HVACStaff> hvacStaffs;
    private ArrayList<ElectricityStaff> electricityStaffs;
    private ArrayList<DepartmentSupervisors> departmentSupervisorses;
    private ArrayList<Database> databases;

    RegistrationRequestsView(ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<AudioVideoStaff>audioVideoStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs) {
        jFrame = new JFrame();
        jPanel = new JPanel();
        this.audioVideoStaffs = new ArrayList<AudioVideoStaff>();
        this.housekeepingStaffs = new ArrayList<HousekeepingStaff>();
        this.securityStaffs = new ArrayList<SecurityStaff>();
        this.hvacStaffs = new ArrayList<HVACStaff>();
        this.electricityStaffs = new ArrayList<ElectricityStaff>();
        this.departmentSupervisorses=new ArrayList<DepartmentSupervisors>();
        this.databases=new ArrayList<Database>();
//        JScrollPane listScroller = new JScrollPane(jPanel);
//        listScroller.setPreferredSize(new Dimension(250, 80));
//        listScroller.setAlignmentX(LEFT_ALIGNMENT);
        jFrame.setSize(400, 400);
        int c = 0;
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

        //System.out.println(registrationRequestses.size());
        if(registrationRequestses.size()==1)
        {
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(new FlowLayout());
            jPanel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            JLabel norequest=new JLabel("Yipee!! No pending Registration Requests.");
            jPanel1.add(norequest);
            jPanel.add(jPanel1);
        }
        else{
            for (RegistrationRequests i : registrationRequestses) {
                if(c>0) {
                    JPanel jPanel2 = new JPanel();
                    jPanel2.setLayout(new FlowLayout());
                    jPanel2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                    JLabel serial1 = new JLabel(Integer.toString(c++));
                    JLabel name1 = new JLabel(i.getNameentered());
                    JLabel department1 = new JLabel(i.getDepartmentselected());
                    JLabel post1 = new JLabel(i.getTypeselected());
                    JButton approve1 = new JButton("Approve");
                    JButton reject1 = new JButton("Reject");
                    jPanel2.add(serial1);
                    jPanel2.add(name1);
                    jPanel2.add(department1);
                    jPanel2.add(post1);
                    jPanel2.add(approve1);
                    jPanel2.add(reject1);
                    jPanel.add(jPanel2);
                    approve1.addActionListener(new ApproveButtonListener(i, registrationRequestses, databases, electricityStaffs, audioVideoStaffs, departmentSupervisorses, housekeepingStaffs, hvacStaffs, securityStaffs));
                    reject1.addActionListener(new RejectButtonListener(i, registrationRequestses));
                }
                else
                    c++;
            }
        }
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }

    class ApproveButtonListener implements ActionListener {
        RegistrationRequests requests;
        ArrayList<RegistrationRequests> fullarray;
         ArrayList<AudioVideoStaff> audioVideoStaffs;
        ArrayList<HousekeepingStaff> housekeepingStaffs;
         ArrayList<SecurityStaff> securityStaffs;
        ArrayList<HVACStaff> hvacStaffs;
         ArrayList<ElectricityStaff> electricityStaffs;
        ArrayList<DepartmentSupervisors> departmentSupervisorses;
         ArrayList<Database> databases;
        ApproveButtonListener(RegistrationRequests registrationRequests,ArrayList<RegistrationRequests> fullarray,ArrayList<Database> databases,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<AudioVideoStaff>audioVideoStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs) {
            this.requests = registrationRequests;
            this.fullarray=fullarray;
            this.audioVideoStaffs=audioVideoStaffs;
            this.housekeepingStaffs=housekeepingStaffs;
            this.securityStaffs=securityStaffs;
            this.hvacStaffs=hvacStaffs;
            this.electricityStaffs=electricityStaffs;
            this.departmentSupervisorses=departmentSupervisorses;
            this.databases=databases;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        int c=0;
            for(RegistrationRequests i:fullarray) {
                if (c > 0) {
                    if (i.getUsernameentered().equals(requests.getUsernameentered())) {

                        departmentselected = i.getDepartmentselected().toString();
                        passwordenterd = new String(i.getPasswordenterd());
                     //   System.out.println("Password entered:" + passwordenterd);
                        addressentered = i.getAddressentered();
                        dateentered = i.getDateentered();
                        nameentered = i.getNameentered();
                        genderentered = i.getGenderentered();
                        typeselected = i.getTypeselected().toString();
                        uniqueID = i.getUniqueID();
                        usernameentered = i.getUsernameentered();
                        fullarray.remove(i);
                        System.out.println("Unique ID:" + uniqueID);
                        System.out.println("Department:" + departmentselected);
                        System.out.println("type:" + typeselected);
                        System.out.println("Usrname:" + usernameentered);
                        System.out.println("Name:" + nameentered);
                        System.out.println("old size="+databases.size());
                        databases.add(new Database(uniqueID, passwordenterd, departmentselected, typeselected, usernameentered, nameentered, "Available"));
                        System.out.println("new size="+databases.size());
                        if (typeselected.equals("Staff")) {
                            System.out.println("ini"+audioVideoStaffs.size());
                            if (departmentselected.equals("Electricity")) {
                                electricityStaffs.add(new ElectricityStaff(nameentered, usernameentered, passwordenterd, uniqueID, "Available", "None", "NOT STARTED"));
                            }
                            if (departmentselected.equals("Security")) {
                                securityStaffs.add(new SecurityStaff(nameentered, usernameentered, passwordenterd, uniqueID, "Available", "None", "NOT STARTED"));

                            }
                            if (departmentselected.equals("Housekeeping")) {
                                housekeepingStaffs.add(new HousekeepingStaff(nameentered, usernameentered, passwordenterd, uniqueID, "Available", "None", "NOT STARTED"));
                            }
                            if (departmentselected.equals("HVAC")) {
                                hvacStaffs.add(new HVACStaff(nameentered, usernameentered, passwordenterd, uniqueID, "Available", "None", "NOT STARTED"));
                            }
                            if (departmentselected.equals("Audio-Video")) {
                               // System.out.println("old size of audio"+audioVideoStaffs.size());
                                audioVideoStaffs.add(new AudioVideoStaff(nameentered, usernameentered, passwordenterd, uniqueID, "Available", "None", "NOT STARTED"));
                                //System.out.println("new size of audio"+audioVideoStaffs.size());
                            }
                        } else if (typeselected.equals("Supervisor")) {
                            departmentSupervisorses.add(new DepartmentSupervisors(nameentered, usernameentered, passwordenterd, uniqueID, departmentselected));
                        }
                        break;
                    }

                } else
                    c++;
            }

            jFrame.setVisible(false);
            new RegistrationRequestsView(fullarray,databases,electricityStaffs,audioVideoStaffs,departmentSupervisorses,housekeepingStaffs,hvacStaffs,securityStaffs);

        }
    }
    class RejectButtonListener implements ActionListener {
        RegistrationRequests requests;
        ArrayList<RegistrationRequests> fullarray;

        RejectButtonListener(RegistrationRequests registrationRequests,ArrayList<RegistrationRequests> fullarray) {
            this.requests = registrationRequests;
            this.fullarray=fullarray;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            for(RegistrationRequests i:fullarray)
            {
                if(i.getNameentered().equals(requests.getNameentered())) {
                    fullarray.remove(i);
                    break;
                }
            }
            jFrame.setVisible(false);
            new RegistrationRequestsView(fullarray,databases,electricityStaffs,audioVideoStaffs,departmentSupervisorses,housekeepingStaffs,hvacStaffs,securityStaffs);
        }
    }
}
