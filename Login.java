import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login {
    private JLabel username;
    private JLabel password;
    private JLabel head;
    private JTextField userfield;
    private JTextField passfield;
    private JPanel jPanel;
    private JButton login;
    private String userentered;
    private String passwordentered;
    private JFrame jf1;
    Login(JFrame jFrame, ArrayList<Database> databases)
    {
        jFrame.setSize(1800,1800);
        username=new JLabel("Username :");
        password=new JLabel("Password :");
        userfield=new JTextField();
        head=new JLabel("Login");
        passfield=new JTextField();
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
                passwordentered=passfield.getText().toString();
                if (userentered.length()==0){ JOptionPane.showMessageDialog(jf1, "Username field is empty ! ");}
                else if(passwordentered.length()==0){JOptionPane.showMessageDialog(jf1, "Password field is empty !");}
                else
                {
                    int flag=0;
                    int c=-1;
                    for(int i=0;i<databases.size();i++) {
                        if(databases.get(i).getUsername().equals(userentered) )
                        {
                            flag=1;
                             if(databases.get(i).getPassword().equals(passwordentered))
                                {

                                }
                        }

                    }
                }
            }
        });
    }
}
