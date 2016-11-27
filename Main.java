import com.opencsv.CSVReader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    private ArrayList<AudioVideoStaff> audioVideoStaffs;
    private ArrayList<HousekeepingStaff> housekeepingStaffs;
    private ArrayList<SecurityStaff> securityStaffs;
    private ArrayList<HVACStaff> hvacStaffs;
    private ArrayList<ElectricityStaff> electricityStaffs;
    private ArrayList<DepartmentSupervisors> departmentSupervisorses;
    private JFrame jFrame;
    private JPanel jPanel;
    private JLabel head;
    private JButton login;
    private JButton register;
    Main()
    {
        //Creating Array-list of different departments
        audioVideoStaffs = new ArrayList<AudioVideoStaff>();
        housekeepingStaffs = new ArrayList<HousekeepingStaff>();
        securityStaffs = new ArrayList<SecurityStaff>();
        hvacStaffs = new ArrayList<HVACStaff>();
        electricityStaffs = new ArrayList<ElectricityStaff>();
        departmentSupervisorses=new ArrayList<DepartmentSupervisors>();


        //Creating strings of different files of csv
        String audiovideo = "Audio-Video Staff.csv";
        String housekeeping="Housekeeping Staff.csv";
        String security="Security Staff.csv";
        String hvac="HVAC Staff.csv";
        String electricity="Electricity Staff.csv";
        String department="Department Supervisors.csv";
        String database="Database.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] array={audiovideo,housekeeping,security,hvac,electricity,department};
        for(int i=0;i<6;i++)
        {
            try{
            BufferedReader br = new BufferedReader(new FileReader(array[i]));
            while ((line = br.readLine()) != null) {
                String[] row = line.split(cvsSplitBy);
                if (i == 0) {
                    audioVideoStaffs.add(new AudioVideoStaff(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
                } else if (i == 1) {
                    housekeepingStaffs.add(new HousekeepingStaff(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
                } else if (i == 2) {
                    securityStaffs.add(new SecurityStaff(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));

                } else if (i == 3) {
                    hvacStaffs.add(new HVACStaff(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
                } else if (i == 4) {
                    electricityStaffs.add(new ElectricityStaff(row[0], row[1], row[2], row[3], row[4], row[5], row[6]));
                } else if (i == 5) {
                    departmentSupervisorses.add(new DepartmentSupervisors(row[0], row[1], row[2], row[3], row[4]));
                }
            }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        jFrame=new JFrame("FMS IIIT-DELHI");
        jFrame.setSize(1800,1800);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel=new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(0,0,1800,1800);
        head =new JLabel("F.M.S.");
        login =new JButton("Login");
        register = new JButton("Register");
        head=new JLabel("FMS");
        head.setFont(new Font("Serif", Font.PLAIN, 150));
        login.setBounds(600,300,100,50);
        register.setBounds(600,400,100,50);
        head.setBounds(500,70,400,200);
        jPanel.add(login);
        jPanel.add(head);
        jPanel.add(register);
        jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.jpg")));
        new ClockPane(jPanel);
        jFrame.add(jPanel);
        jFrame.setResizable(false);
        jFrame.setVisible(true);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                jFrame.remove(jPanel);

                System.out.print("Register button pressed.");
               Register reg= new Register(jFrame);
            }
        });



        //Creating objects of CSVReader
        try {
            CSVReader audiovideoreader = new CSVReader(new FileReader(audiovideo), ',');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            CSVReader housekeepingreader = new CSVReader(new FileReader(housekeeping), ',');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            CSVReader securityreader = new CSVReader(new FileReader(security), ',');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            CSVReader hvacreader = new CSVReader(new FileReader(hvac), ',');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            CSVReader electricityreader = new CSVReader(new FileReader(electricity), ',');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws IOException {
        new Main();
    }
}

