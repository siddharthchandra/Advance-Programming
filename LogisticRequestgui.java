/**
 * Created by prasoon on 29/11/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.UUID;


public class LogisticRequestgui {

    private JTextField userfield;
    private JTextField material;

    private String departmentselected;
    private String usernameentered;

    private String typeselected;
    private String materialentered;

    private JLabel head;
   ;
    private JLabel Username;
    private JLabel Material;

    private JLabel Type;


    private JLabel Department;
    private JPanel panel;
    private JButton submit;
    private JFrame jFrame;
    private JButton ok;

    LogisticRequestgui()//JFrame jFrame, ArrayList<Database> databases,ArrayList<RegistrationRequests> registrationRequestses)
    {

        jFrame = new JFrame();
        submit = new JButton("submit");
        jFrame.setSize(1800, 1800);
        panel = new JPanel();
        panel.setLayout(null);

        userfield = new JTextField();
        material=new JTextField();
        panel.setBounds(0, 0, 1800, 1800);

        head = new JLabel("Request Logistics");
        Material=new JLabel("Materials Required");
        Username = new JLabel("Username :");

        Type = new JLabel("Type :");

        Department = new JLabel("Department");

        head.setBounds(550, 70, 600, 50);
        head.setFont(new Font("Serif", Font.PLAIN, 40));
        Username.setBounds(200, 150, 120, 30);
        userfield.setBounds(350, 150, 150, 30);
        Material.setBounds(200,200,150,30);
        material.setBounds(350,200,200,50);
        Department.setBounds(200, 300, 120, 30);
        String[] departmentmenu = new String[]{"Electricity", "Housekeeping", "Security", "HVAC", "Audio-Video"};
        JComboBox<String> departmentList = new JComboBox<>(departmentmenu);
        departmentList.setBounds(350, 300, 150, 30);

        Type.setBounds(200, 400, 80, 30);
        String[] typemenu = new String[]{"Supervisor", "Staff"};
        JComboBox<String> typeList = new JComboBox<>(typemenu);
        typeList.setBounds(350, 400, 120, 30);
        submit.setBounds(600, 650, 100, 50);
        panel.add(head);
        panel.add(userfield);

        panel.add(Department);
        panel.add(departmentList);
        panel.add(Material);
        panel.add(material);
        panel.add(Type);
        panel.add(typeList);

        new ClockPane(panel);
        panel.add(Username);
        panel.add(submit);
        jFrame.add(panel);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
    }}