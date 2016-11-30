/**
 * Created by Siddharth on 11/30/2016.
 */
public class LeaveRequest {
    private  String from;
    private String till;
    private String reason;
    private String username;
    private String department;
    private String post;
    LeaveRequest(String from,String till,String reason,String username,String department,String post)
    {
        this.from=from;
        this.till=till;
        this.reason=reason;
        this.username=username;
        this.department=department;
        this.post=post;
    }
    public String getFrom(){return this.from;}
    public String getTill(){return this.till;}
    public String getReason(){return this.reason;}
    public String getUsername(){return this.username;}
    public String getDepartment(){return this.department;}
    public String getPost(){return this.post;}
}
