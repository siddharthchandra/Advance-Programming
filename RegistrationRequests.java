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


    RegistrationRequests(String usernameentered,String passwordenterd,String uniqueID,String nameentered,String departmentselected,String typeselected,String dateentered,String addressentered,String genderentered)
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
