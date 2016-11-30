import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class LeaveRequestsView {
    private JFrame jFrame1;
    private JPanel panel;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;

    LeaveRequestsView(ArrayList<LeaveRequest> leaveRequests) {
        table = new JTable();
        panel = new JPanel();
        int rows = leaveRequests.size();
        int no = 1;
        String[] columns = new String[]{"S. no.", "Username", "Department", "From", "Till", "Reason"};
        Object[][] data = new Object[rows][6];
        for (LeaveRequest i : leaveRequests) {
            System.out.println(i.getUsername());
            if (i.getPost().equals("Supervisor")) {
                data[no - 1][0] = no;
                data[no - 1][1] = i.getUsername();
                data[no - 1][2] = i.getDepartment();
                data[no - 1][3] = i.getFrom();
                data[no - 1][4] = i.getTill();
                data[no - 1][5] = i.getReason();
                no++;
            }
        }
            model = new DefaultTableModel(data, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jFrame1 = new JFrame();
            table = new JTable(model);
            jFrame1.setSize(600, 600);
            scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            panel.add(scrollPane);
            table.setSize(table.getPreferredSize());

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            table.setLocation(dim.width / 2 - table.getSize().width / 2,
                    dim.height / 2 - table.getSize().height / 2);
            table.getTableHeader().setReorderingAllowed(false);
            jFrame1.add(panel);
            jFrame1.setTitle("Leave Requests");
            jFrame1.pack();
            jFrame1.setVisible(true);
        }
    }

