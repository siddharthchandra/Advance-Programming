public class Staff {
    private String Username;
    private String UniqueID;
    private String Password;
    private String Status;
    private String Name;
    private String TillWhen;
    private String TaskStatus;
    Staff()
    {
        this.UniqueID="";
        this.Name="";
        this.Password="";
        this.Username="";
        this.Status="";
        this.TillWhen="";
        this.TaskStatus="";
    }
    // super(Name,Username,Password,UniqueID,Status,TillWhen,TaskStatus);
    Staff(String Name,String Username,String Password,String UniqueID,String Status,String TillWhen,String TaskStatus)
    {
        this.UniqueID=UniqueID;
        this.Name=Name;
        this.Password=Password;
        this.Username=Username;
        this.TaskStatus=TaskStatus;
        this.TillWhen=TillWhen;
        this.Status=Status;
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
    public String getUniqueID()
    {
        return this.UniqueID;
    }
    public  String getStatus()
    {
        return this.Status;
    }
    public String getTillWhen()
    {
        return this.TillWhen;
    }
    public String getTaskStatus()
    {
        return this.TaskStatus;
    }
    public void setUsername(String Username)
    {
        this.Username=Username;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setPassword(String Password)
    {
        this.Password=Password;
    }
    public void setUniqueID(String UniqueID)
    {
        this.UniqueID=UniqueID;
    }
    public void setStatus(String Status)
    {
        this.Status=Status;
    }
    public void setTillWhen(String TillWhen)
    {
        this.TillWhen=TillWhen;
    }
    public void setTaskStatus(String TaskStatus)
    {
        this.TaskStatus=TaskStatus;
    }

}
