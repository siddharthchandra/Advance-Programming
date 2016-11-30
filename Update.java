import java.io.*;
import java.util.ArrayList;

public class Update {
    Update(ArrayList<LogisticsRequests> logisticsRequestses,ArrayList<LeaveRequest> leaveRequests,ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses) throws IOException {
        //Creating strings of different files of csv
        String audiovideo = "Audio-Video Staff.csv";
        String housekeeping="Housekeeping Staff.csv";
        String security="Security Staff.csv";
        String hvac="HVAC Staff.csv";
        String electricity="Electricity Staff.csv";
        String department="Department Supervisors.csv";
        String database="Database.csv";
        String assign="Assigned Tasks.csv";
        String regrequests="Registration Requests.csv";
        String leavere="Leave Requests.csv";
        String logistics="Logistics.csv";
        //System.out.print(audioVideoStaffs.size());
        Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(audiovideo), "utf-8"));
       Writer writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(housekeeping), "utf-8"));
        Writer writer3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(security), "utf-8"));
        Writer writer4 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(hvac), "utf-8"));
        Writer writer5 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(electricity), "utf-8"));
        Writer writer6 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(department), "utf-8"));
        Writer writer7 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database), "utf-8"));
        Writer writer8 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(assign), "utf-8"));
        Writer writer9 =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(regrequests),"utf-8"));
        Writer writer10 =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(leavere),"utf-8"));
        Writer writer11 =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logistics),"utf-8"));
        for (AudioVideoStaff user : audioVideoStaffs)
        {
           // System.out.println(user.getName());
            writer1.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getStatus() + "," + user.getTillWhen() + "," + user.getTaskStatus());
            writer1.write("\n");
        }

        for(AssignTask ass : assignTasks)
            writer8.write(ass.getTasknameentered()+","+ass.getDescriptionentered()+","+ass.getUniqueIDentered()+","+ass.getDepartmentselected()+","+ass.getStaffusernameentered()+","+ass.getEquipmentsentered()+","+ass.getDeadlineentered()+","+ass.getAssignedby()+"\n");
        for (HousekeepingStaff user : housekeepingStaffs)
        {  writer2.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getStatus() + "," + user.getTillWhen() + "," + user.getTaskStatus());
        writer2.write("\n");}
        for (ElectricityStaff user : electricityStaffs)
        {   writer5.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getStatus() + "," + user.getTillWhen() + "," + user.getTaskStatus());
        writer5.write("\n");}
        for (HVACStaff user : hvacStaffs)
        {writer4.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getStatus() + "," + user.getTillWhen() + "," + user.getTaskStatus());
        writer4.write("\n");}
        for (SecurityStaff user : securityStaffs)
        {   writer3.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getStatus() + "," + user.getTillWhen() + "," + user.getTaskStatus());
        writer3.write("\n");}
        for (RegistrationRequests user : registrationRequestses)
        { writer9.write(user.getUsernameentered() + "," + user.getPasswordenterd() + "," + user.getUniqueID() + "," + user.getNameentered() + "," + user.getDepartmentselected() + "," + user.getTypeselected() + "," + user.getDateentered()+","+user.getAddressentered()+","+user.getGenderentered());
        writer9.write("\n");}
        for (Database user : databases)
        {   writer7.write(user.getUniqueID() + "," + user.getPassword() + "," + user.getDepartment() + "," + user.getPost() + "," + user.getUsername() + "," + user.getName() + "," + user.getStatus());
        writer7.write("\n");}
        for (DepartmentSupervisors user : departmentSupervisorses)
        { writer6.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getDepartment());// + "," + user.getPost() + "," + user.getDOB()+","+user.getAddress()+","+getGender());
        writer6.write("\n");}
        for(LeaveRequest user:leaveRequests )
        {
            writer10.write(user.getFrom()+","+user.getTill()+","+user.getReason()+","+user.getUsername()+","+user.getDepartment()+","+user.getPost());
            writer10.write("\n");
        }
        for(LogisticsRequests user :logisticsRequestses)
        {
            writer11.write(user.getUsername()+","+user.getDepartment()+","+user.getMaterialsNeeded()+","+user.getRequestedBy());
            writer11.write("\n");
        }
        writer1.close();
        writer2.close();
        writer3.close();
        writer4.close();
        writer5.close();
        writer6.close();
        writer7.close();
        writer8.close();
        writer9.close();
        writer1.close();
        writer10.close();
        writer11.close();




    }}




