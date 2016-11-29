import java.io.*;
import java.util.ArrayList;

public class Update {
    Update(ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses) {
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

   
            Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(audiovideo),"utf-8"));
   Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(housekeeping),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(security),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(hvac),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(electricity),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(department),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(assign),"utf-8"));
         Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(regrequests),"utf-8"));
}
}
