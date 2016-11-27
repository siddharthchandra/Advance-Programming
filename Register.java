import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

/**
 * Created by Siddharth on 11/27/2016.
 */
public class Register {
    private JTextField namefield;
    private JTextField userfield;
    private JTextField addressfield;
    private JTextField datefield;
    private JTextField typefield;
    private JPasswordField passwordField;
    private JLabel head;
    private JLabel Name;
    private JLabel Username;
    private JLabel Password;
    private JLabel ID;
    private JLabel IDfield;
    private JLabel Type;
    private JLabel DOB;
    private JLabel Address;
    private JLabel Gender;
    private JLabel Department;
    private String uniqueID;
    private JPanel panel;
    private JButton submit;
    Register(JFrame jFrame)
    {
        submit=new JButton("Register");
        jFrame.setSize(1800, 1800);
        panel=new JPanel();
        panel.setLayout(null);
        passwordField = new JPasswordField(20);
        userfield=new JTextField();
        addressfield=new JTextField();
        datefield=new JTextField();
        panel.setBounds(0,0,1800,1800);
        uniqueID = UUID.randomUUID().toString();
        head=new JLabel("Registration");
        Name=new JLabel("Name :");
        Password=new JLabel("Password :");
        Username=new JLabel("Username :");
        ID=new JLabel("ID :");
        Type=new JLabel("Type :");
        DOB=new JLabel("Date Of Birth :");
        Address=new JLabel("Address :");
        Department=new JLabel("Department");
        IDfield=new JLabel();
        namefield=new JTextField();
        Gender= new JLabel("Gender");
        typefield=new JTextField();
        head.setBounds(550,70,200,50);
        head.setFont(new Font("Serif", Font.PLAIN, 40));
        Username.setBounds(200,150,80,30);
        userfield.setBounds(300,150,150,30);
        Password.setBounds(200,200,80,30);
        passwordField.setBounds(300,200,80,30);
         ID.setBounds(200,250,80, 30);
        uniqueID = UUID.randomUUID().toString();
        IDfield.setBounds(300,250,250,30);
        IDfield.setText(uniqueID);
       Name.setBounds(200,300,80, 30);
        namefield.setBounds(300,300,80,30);
        Gender.setBounds(200, 350, 80, 30);
        String[] gendermenu = new String[] {"Male","Female","Others"};
        JComboBox<String> genderList = new JComboBox<>(gendermenu);
        genderList.setBounds(300,350,80,30);
// get the selected item:
       // String selectedBook = (String) bookList.getSelectedItem();
        //System.out.println("You seleted the book: " + selectedBook);
        Address.setBounds(200,400, 80, 30);
        addressfield.setBounds(300,400,300,50);
        Department.setBounds(200,500, 80, 30);
        String[] departmentmenu = new String[] {"Electricity","Housekeeping","Security","HVAC","Audio-Video"};
        JComboBox<String> departmentList = new JComboBox<>(departmentmenu);
        departmentList.setBounds(300,500,150,30);
       DOB.setBounds(200,550,80,30);
        datefield.setBounds(300,550,80,30);
       Type.setBounds(200,600,80,30);
        String[] typemenu = new String[] {"Supervisor","Staff"};
        JComboBox<String> typeList = new JComboBox<>(typemenu);
        typeList.setBounds(300,600,120,30);
        submit.setBounds(600,650,100,50);
        panel.add(head);
        panel.add(userfield);
        panel.add(Password);
        panel.add(passwordField);
        panel.add(ID);
        panel.add(Department);
        panel.add(departmentList);
        panel.add(IDfield);
        panel.add(Name);
        panel.add(namefield);
        panel.add(DOB);
        panel.add(Type);
        panel.add(typeList);
        panel.add(Gender);
        panel.add(datefield);
        panel.add(genderList);
        panel.add(Address);
        panel.add(addressfield);
        new ClockPane(panel);
        panel.add(Username);
        panel.add(submit);
        jFrame.add(panel);
        //jFrame.setResizable(false);
        jFrame.setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf1 = new JFrame("ERROR : FIELD IS EMPTY !");
                jf1.setSize(401, 401);
                jf1.setDefaultCloseOperation(jf1.EXIT_ON_CLOSE);
               if(userfield.getText().length()==0)
                {

                    JOptionPane.showMessageDialog(jf1, "Enter your Username !");
                }
                else if(passwordField.getPassword().length==0)
                {
                    JOptionPane.showMessageDialog(jf1, "Enter your Desired Password !");
                }
                else if(namefield.getText().length()==0)
               {

                   JOptionPane.showMessageDialog(jf1, "Name field is empty !");
               }
               else if(addressfield.getText().length()==0)
                {
                    JOptionPane.showMessageDialog(jf1, "Address field is empty !");
                }
                else if(datefield.getText().length()==0)
               {
                   JOptionPane.showMessageDialog(jf1, "DOB field is empty !");
               }
            }
        });

    }
}
