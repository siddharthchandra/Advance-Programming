/**
 * Created by prasoon on 16/11/16.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class view1 {

    //static final int width = 500;
    //static final int hight = 600;
   private JPanel panel;
    private JTable table;
private JFrame frame;
    DefaultTableModel model;

    private JScrollPane scrollpane;
    public view1() {
        table=new JTable();
        frame=new JFrame();
        panel=new JPanel();
        String[] columns = new String[]{
                "Id", "Name", "Hourly Rate", "Part Time","delete"
        };
       JButton delete=new JButton("delete");
        //actual data for the table in a 2d array
        Object[][] data = new Object[][]{
                {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"}, {1, "John", 40.0, false,"delete"},
                {2, "Rambo", 70.0, false,"delete"},
                {3, "Zorro", 60.0, true,"delete"},
        };
     /*   table.getColumn("delete").addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    JTable target = (JTable)e.getSource();
                    int row = target.getSelectedRow();
                    int column = target.getSelectedColumn();
                    // do some action if appropriate column
                }
            }
        });*/
        DefaultTableModel model = new DefaultTableModel(data, columns) {

            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }};
        //create table with data
        JTable table = new JTable(model);
frame.setSize(600,600);
        scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollpane);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        table.setLocation(dim.width/2-table.getSize().width/2,
                dim.height/2-table.getSize().height/2);
        table.getTableHeader().setReorderingAllowed(false);
        //add the table to the frame
        panel.add(scrollpane);
frame.add(panel);
        frame.setTitle("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //Defining Model for table
        /*panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setBounds(10, 10, 500, 500);
        panel.setBorder(BorderFactory.createDashedBorder(Color.blue));
         model = new DefaultTableModel();
       // panel=new JPanel();
        frame=new JFrame();
        //Adding object of DefaultTableModel into JTable
        table = new JTable(model);

        //Fixing Columns move
        table.getTableHeader().setReorderingAllowed(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        table.setLocation(dim.width/2-table.getSize().width/2,
              dim.height/2-table.getSize().height/2);
        // Defining Column Names on model
        model.addColumn("S.No");
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Address");
        model.addColumn("Contact");

    addRows(model);
        frame.setSize(600,600);
        scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollpane);
        panel.add(table);
        frame.add(panel);
       // frame.setSize(1000,1000);
        frame.setVisible(true);
    }
    private void addRows(DefaultTableModel model){

            Object[] row = null;
            //Generating Serial No
           // serialNo=1;
            //rst = stmt.executeQuery("select *from regForm");
//            while(rst.next()){
                String string = 1 +","+"Prasoon"+", "+"244"+","+"male"+", "+"eafwefv"+","+"fvev";
                row = string.split(",");

                // Adding records in table model
                model.addRow(row);
            }
*/

    }}

