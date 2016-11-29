import javax.swing.*;
import java.util.ArrayList;

public class HousekeepingStaff extends Staff {
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    HousekeepingStaff(JFrame jFrame, ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses,int check)
    {
        this.UniqueID="";
        this.Name="";
        this.Password="";
        this.Username="";
        this.Status="";
        this.TillWhen="";
        this.TaskStatus="";
    }

    HousekeepingStaff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
        super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
    }
}
