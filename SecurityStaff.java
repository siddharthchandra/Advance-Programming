import javax.swing.*;
import java.util.ArrayList;

public class SecurityStaff extends Staff{
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    SecurityStaff(JFrame jFrame, ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses, int check)
    {

    }
    SecurityStaff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
        super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
    }
}
