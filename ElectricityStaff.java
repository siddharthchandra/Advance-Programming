import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Siddharth on 11/14/2016.
 */
public class ElectricityStaff extends Staff {
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    ElectricityStaff(JFrame jFrame, ArrayList<ElectricityStaff> electricityStaffs, ArrayList<DepartmentSupervisors> departmentSupervisorses, int check)
    {
        this.UniqueID="";
        this.Name="";
        this.Password="";
        this.Username="";
        this.Status="";
        this.TillWhen="";
        this.TaskStatus="";
    }
    ElectricityStaff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
       super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
    }
}
