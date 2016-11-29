/**
 * Created by prasoon on 29/11/16.
 */
import java.io.*;
import java.util.ArrayList;

public class Update {
    Update(ArrayList<AssignTask> assignTasks,ArrayList<RegistrationRequests> registrationRequestses,ArrayList<Database> databases,ArrayList<AudioVideoStaff> audioVideoStaffs,ArrayList<ElectricityStaff> electricityStaffs,ArrayList<HousekeepingStaff> housekeepingStaffs,ArrayList<HVACStaff> hvacStaffs,ArrayList<SecurityStaff> securityStaffs,ArrayList<DepartmentSupervisors> departmentSupervisorses) throws IOException {
        //Creating strings of different files of csv
        String audiovideo = "Audio-Video Staff.csv";
        String housekeeping = "Housekeeping Staff.csv";
        String security = "Security Staff.csv";
        String hvac = "HVAC Staff.csv";
        String electricity = "Electricity Staff.csv";
        String department = "Department Supervisors.csv";
        String database = "Database.csv";
        String assign = "Assigned Tasks.csv";
        String regrequests = "Registration Requests.csv";
        Writer writer1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(audiovideo), "utf-8"));
        Writer writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(housekeeping), "utf-8"));
        Writer writer3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(security), "utf-8"));
        Writer writer4 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(hvac), "utf-8"));
        Writer writer5 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(electricity), "utf-8"));
        Writer writer6 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(department), "utf-8"));
        Writer writer7 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database), "utf-8"));
        Writer writer8 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(assign), "utf-8"));
        for (AudioVideo user : ArrayList<AudioVideo>)
            writer1.write(user.getName() + "," + user.getUsername() + "," + user.getPassword() + "," + user.getUniqueID() + "," + user.getStatus() + "," + user.getTillWhen() + "," + user.getTaskStatus());
    }}