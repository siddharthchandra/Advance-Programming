import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Siddharth on 11/30/2016.
 */
public class ViewAudioVideoStaff {
    private JFrame jFrame1;
    private JPanel panel;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;
    ViewAudioVideoStaff(ArrayList<AudioVideoStaff> audioVideoStaffs)
    {
        table=new JTable();
        panel=new JPanel();
        int rows=audioVideoStaffs.size()-1;
        int no=1;
        int c=1;
        String[] columns=new String[]{"S. no.","Username","Name","Status"};
        Object[][] data=new Object[rows][6];
        for(AudioVideoStaff i:audioVideoStaffs)
        {
            if(c==0) {
                data[no - 1][0] = no;
                data[no - 1][1] = i.getUsername();
                data[no - 1][2] = i.getName();
                data[no - 1][3] = i.getStatus();
                no++;
            }
            else c=0;
        }
        model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jFrame1=new JFrame();
        table = new JTable(model);
        jFrame1.setSize(600,600);
        scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane);
        table.setSize(table.getPreferredSize());

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        table.setLocation(dim.width / 2 - table.getSize().width / 2,
                dim.height / 2 - table.getSize().height / 2);
        table.getTableHeader().setReorderingAllowed(false);
        jFrame1.add(panel);
        jFrame1.setTitle("Audio Video Staff Database");
        jFrame1.pack();
        jFrame1.setVisible(true);
    }
}
