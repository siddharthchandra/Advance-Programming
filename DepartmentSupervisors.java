import javax.swing.*;
import java.util.ArrayList;

public class DepartmentSupervisors {
    private String Username;
    private String Name;
    private String Password;
    private String UniqueID;
    private String Department;
        DepartmentSupervisors(String Name,String Username,String Password,String UniqueID,String Department)
        {
            this.UniqueID=UniqueID;
            this.Name=Name;
            this.Password=Password;
            this.Department=Department;
            this.Username=Username;
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
        public String getDepartment()
        {
            return this.Department;
        }
        public void setUsername(String Username) {this.Username=Username;}
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
        public void setDepartment(String Department)
        {
            this.Department=Department;
        }
}
