import javax.swing.*;
import java.util.ArrayList;

public class AudioVideoStaff extends Staff{
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    private String Gender;
    private String Address;
    private String DOB;
    AudioVideoStaff(JFrame jFrame, ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses, int check)
    {
        if(check==0)
        {

        }
        else
        {

        }
    }
    AudioVideoStaff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
        super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
    }
    public String getUsername()
    {
        return this.Username;
    }
    public String getName()
    {
        return this.Name;
    }
    public String getPassword()
    {
        return this.Password;
    }
}
