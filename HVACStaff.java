public class HVACStaff extends Staff{
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    HVACStaff()
    {
        this.UniqueID="";
        this.Name="";
        this.Password="";
        this.Username="";
        this.Status="";
        this.TillWhen="";
        this.TaskStatus="";
    }
    HVACStaff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
        super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
    }
}
