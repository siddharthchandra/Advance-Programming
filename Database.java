/**
 * Created by SIDDHARTH CHANDRA 2015100 & PRASOON JAIN 2015157
 */
public class Database {
    private String UniqueID;
    private String Password;
    private String Department;
    private String Post;
    private String Username;
    private String Name;
    private String Status;
    Database(String uniqueID,String password,String department,String post,String username,String Name,String Status)
    {
        this.Name=Name;
        this.UniqueID=uniqueID;
        this.Password=password;
        this.Department=department;
        this.Post=post;
        this.Username=username;
        this.Status=Status;
    }
    public String getName(){ return  this.Name;}
    public void setName(String name){this.Name=Name;}
    public String getUsername()
    {
        return this.Username;
    }
    public String getPassword()
    {
        return this.Password;
    }
    public String getPost() { return  this.Post; }
    public String getUniqueID()
    {
        return this.UniqueID;
    }
    public String getDepartment()
    {
        return this.Department;
    }
    public void setUsername(String Username) {this.Username=Username;}
    public void setPassword(String Password)
    {
        this.Password=Password;
    }
    public void setUniqueID(String UniqueID)
    {
        this.UniqueID=UniqueID;
    }
    public void setDepartment(String Department)
    {
        this.Department=Department;
    }
    public void setPost(String post) { this.Post=post; }
    public String getStatus(){return this.Status;}
    public void setStatus(String Status){this.Status=Status;}
}
