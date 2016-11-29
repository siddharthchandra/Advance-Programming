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
         Writer writer1=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(audiovideo),"utf-8"));
         Writer writer2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(housekeeping),"utf-8")); 
        Writer writer3=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(security),"utf-8"));
         Writer writer4=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(hvac),"utf-8"));
         Writer writer5=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(electricity),"utf-8"));
         Writer writer6=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(department),"utf-8"));
         Writer writer7=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database),"utf-8"));
         Writer writer8=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(assign),"utf-8"));
         for (AudioVideo user:list)
        writer1.write(user.getUserType()+","+user.getName()+","+user.getEmail()+","+user.getPhone()+","+user.getUserName()+","+user.getHashedPassword()+","+user.getoAuthToken()+",");
        /*void writeDataToDatabase(String fileName, String dataType, List<User> list) throws IOException {
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
                private void writeUser(Writer writer, User user) throws IOException {
        writer.write(user.getUserType()+","+user.getName()+","+user.getEmail()+","+user.getPhone()+","+user.getUserName()+","+user.getHashedPassword()+","+user.getoAuthToken()+",");
    }*/
    }
}
