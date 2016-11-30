import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;
/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class AssignTask {
    private JTextField TaskName;
    private JTextField TaskDescription;
    private JTextField Staff;
    private JTextField Equipment;
    private JTextField Deadline;
    private JLabel head;
    private JLabel taskname;
    private JLabel taskdescription;
    private JLabel staff;
    private JLabel equipment;
    private JLabel deadline;
    private JLabel ID;
    private JLabel IDfield;
    private JLabel Department;
    private JPanel panel1;
    private JButton submit;
    private String uniqueID;
    private JFrame jFrame;
    private JButton assign;
    private String tasknameentered;
    private String descriptionentered;
    private String uniqueIDentered;
    private String departmentselected;
    private String staffusernameentered;
    private String equipmentsentered;
    private String deadlineentered;
    private String assignedby;
    AssignTask(String tasknameentered,String descriptionentered,String uniqueID,String departmentselected,String staffusernameentered,String equipmentsentered,String deadlineentered,String assignedby)
    {
        this.tasknameentered=tasknameentered;
        this.descriptionentered=descriptionentered;
        this.uniqueIDentered=uniqueID;
        this.departmentselected=departmentselected;
        this.staffusernameentered=staffusernameentered;
        this.equipmentsentered=equipmentsentered;
        this.deadlineentered=deadlineentered;
        this.assignedby=assignedby;
    }
    AssignTask(ArrayList<AssignTask> assignTasks){
        jFrame=new JFrame();
        submit=new JButton("Assign");
        jFrame.setSize(1800,1800);
        panel1=new JPanel();
        panel1.setLayout(null);
        TaskName=new JTextField();
        TaskDescription=new JTextField();
        Staff=new JTextField();
        Equipment=new JTextField();
        Deadline=new JTextField();
        panel1.setBounds(0,0,1800,1800);
        uniqueID=UUID.randomUUID().toString();
        head=new JLabel("Assign Task");
        taskname=new JLabel("Task Name:");
        taskdescription=new JLabel("Task Description:");
        staff=new JLabel("Staff Username:");
        assign=new JButton("Assign");
        equipment=new JLabel("Equipments available");
        deadline=new JLabel("Deadline");
        ID=new JLabel("ID : ");
        Department=new JLabel("Department");
        IDfield=new JLabel();
        head.setBounds(550,70,200,50);
        head.setFont(new Font("Serif", Font.PLAIN, 40));
        TaskName.setBounds(370,150,200,30);
        taskname.setBounds(200,150,150,30);
        TaskDescription.setBounds(370,200,250,30);
        taskdescription.setBounds(200,200,250,30);
        ID.setBounds(200,250,80,30);
        uniqueID=UUID.randomUUID().toString();
        IDfield.setBounds(370,250,400,30);
        IDfield.setText(uniqueID);
        Department.setBounds(200,300,80,30);
        String[] Departmentmenu=new String[]{"Electricity","Housekeeping","Security","HVAC","Audio-Video"};
        JComboBox<String> departmentlist=new JComboBox<>(Departmentmenu);
        departmentlist.setBounds(370,300,150,30);
        Staff.setBounds(370,350, 80, 30);
        staff.setBounds(200,350,300,30);
        Equipment.setBounds(370,400, 300, 30);
        equipment.setBounds(200,400,150,30);
        Deadline.setBounds(370,450, 80, 30);
        deadline.setBounds(200,450,300,50);
        assign.setBounds(570,530,100,50);
        panel1.add(head);
        panel1.add(ID);
        panel1.add(assign);
        panel1.add(Department);
        panel1.add(departmentlist);
        panel1.add(IDfield);
        panel1.add(TaskName);
        panel1.add(taskname);
        panel1.add(TaskDescription);
        panel1.add(taskdescription);
        new ClockPane(panel1);
        panel1.add(Staff);
        panel1.add(staff);
        panel1.add(Equipment);
        panel1.add(equipment);
        panel1.add(Deadline);
        panel1.add(deadline);
        panel1.add(submit);
        jFrame.add(panel1);
        jFrame.setVisible(true);
        assign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                assignTasks.add(new AssignTask(TaskName.getText(),TaskDescription.getText(),IDfield.getText(),departmentlist.getSelectedItem().toString(), Staff.getText(),Equipment.getText(),Deadline.getText(),"Admin"));
                jFrame.setVisible(false);
            }
        });
    }

    public String getTasknameentered(){return this.tasknameentered;}
    public String getDescriptionentered(){return this.descriptionentered;}
    public String getUniqueIDentered(){return this.uniqueIDentered;}
    public  String getDepartmentselected(){return this.departmentselected;}
    public String getStaffusernameentered(){return this.staffusernameentered;}
    public String getEquipmentsentered(){return this.equipmentsentered;}
    public String getDeadlineentered(){return this.deadlineentered;}
    public String getAssignedby(){return this.assignedby;}

}
