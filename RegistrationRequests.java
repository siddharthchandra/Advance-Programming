public class RegistrationRequests {
    private String departmentselected;
    private String usernameentered;
    private String nameentered;
    private String addressentered;
    private String passwordenterd;
    private String dateentered;
    private String typeselected;
    private String genderentered;
    private String uniqueID;
    RegistrationRequests(String usernameentered,String passwordenterd,String uniqueID,String nameentered,String genderentered,String addressentered,String departmentselected,String dateentered,String typeselected)
    {
        this.departmentselected=departmentselected;
        this.usernameentered=usernameentered;
        this.nameentered=nameentered;
        this.addressentered=addressentered;
        this.passwordenterd=passwordenterd;
        this.dateentered=dateentered;
        this.typeselected=typeselected;
        this.genderentered=genderentered;
        this.uniqueID=uniqueID;
    }
    public void setGenderentered(String genderentered) {this.genderentered=genderentered;}
    public void  setDepartmentselected(String departmentselected) {this.departmentselected=departmentselected;}
    public void setUsernameentered(String usernameentered) {this.departmentselected=usernameentered;}
    public void setNameentered(String nameentered) {this.nameentered=nameentered;}
    public void setAddressentered(String addressentered) {this.addressentered=addressentered;}
    public void setPasswordenterd(String passwordenterd) {this.passwordenterd=passwordenterd;}
    public void setDateentered(String dateentered) {this.dateentered=dateentered;}
    public void setTypeselected(String typeselected) {this.typeselected=typeselected;}
    public void setUniqueID(String uniqueID) {this.uniqueID=uniqueID;}
    public String getDepartmentselected(){return this.departmentselected;}
    public String getUsernameentered(){return this.usernameentered;}
    public String getNameentered(){return this.nameentered;}
    public String getAddressentered(){return this.addressentered;}
    public String getPasswordenterd(){return this.passwordenterd;}
    public String getDateentered(){ return this.dateentered; }
    public String getTypeselected(){return this.typeselected;}
    public String getGenderentered(){return this.genderentered; }
    public String getUniqueID(){return this.uniqueID;}


}
