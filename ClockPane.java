import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class ClockPane extends JPanel {

    private JLabel clock = new JLabel();

    public ClockPane(JPanel jPanel) {
        tickTock();
        clock.setBounds(1200,0,150,50);
        jPanel.add(clock);
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tickTock();
            }
        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();
    }

    public void tickTock() {
        clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }
}