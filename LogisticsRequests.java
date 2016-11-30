/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class LogisticsRequests {
    private String Username;
    private String Department;
    private String MaterialsNeeded;
    private String RequestedBy;
    LogisticsRequests(String Username,String Department,String MaterialsNeeded,String RequestedBy)
    {
        this.Department=Department;
        this.MaterialsNeeded=MaterialsNeeded;
        this.RequestedBy=RequestedBy;
        this.Username=Username;
    }
    public String getUsername(){return this.Username;}
    public String getDepartment(){return this.Department;}
    public String getMaterialsNeeded(){return this.MaterialsNeeded;}
    public String getRequestedBy(){return this.RequestedBy;}
}
