import java.io.*;
import java.util.ArrayList;

public class Update {
    Update(ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses) throws IOException {
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

    void writeDataToDatabase(String fileName, String dataType, List<User> list) throws IOException {
        try {
            Writer writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName),"utf-8"));
   switch (dataType){
                case "Users": {
                    for (User user:list) {
                        writeUser(writer, user);
                    }
                    break;
                }
                case "Tasks":{
                    for (Task task:database.getTasks())
                        writeTask(writer,task);
                    break;
                }
                case "Leave":{
                    for (Leave leave:database.getLeaveList())
                        writeLeave(writer,leave);
                    break;
                }
                case "Request":{
                    for (Request request:database.getRequestList())
                        writeRequest(writer,request);
                }
            }
            writer.close();
        }
        catch (IOException e){
            throw e;
        }
        
        }
}
