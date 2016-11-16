import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        //Creating Array-list of different departments
        ArrayList<AudioVideoStaff> audioVideoStaffs = new ArrayList<AudioVideoStaff>();
        ArrayList<HousekeepingStaff> housekeepingStaffs = new ArrayList<HousekeepingStaff>();
        ArrayList<SecurityStaff> securityStaffs = new ArrayList<SecurityStaff>();
        ArrayList<HVACStaff> hvacStaffs = new ArrayList<HVACStaff>();
        ArrayList<ElectricityStaff> electricityStaffs = new ArrayList<ElectricityStaff>();
        ArrayList<DepartmentSupervisors> departmentSupervisorses=new ArrayList<DepartmentSupervisors>();
        //Creating strings of different files of csv
        String audiovideo = "Audio-Video Staff.csv";
        String housekeeping="Housekeeping Staff.csv";
        String security="Security Staff.csv";
        String hvac="HVAC Staff.csv";
        String electricity="Electricity Staff.csv";
        String department="Department Supervisors.csv";
        String database="Database.csv";
        String line = "";
        String cvsSplitBy = ",";
        String[] array={audiovideo,housekeeping,security,hvac,electricity,department};
        for(int i=0;i<6;i++)
        {
            BufferedReader br = new BufferedReader(new FileReader(array[i]));
            while ((line = br.readLine()) != null)
            {
                String[] row = line.split(cvsSplitBy);
                if(i==0)
                {
                    audioVideoStaffs.add(new AudioVideoStaff(row[0],row[1],row[2],row[3],row[4],row[5],row[6]));
                }
                else if(i==1)
                {
                    housekeepingStaffs.add(new HousekeepingStaff(row[0],row[1],row[2],row[3],row[4],row[5],row[6]));
                }
                else if(i==2)
                {
                    securityStaffs.add(new SecurityStaff(row[0],row[1],row[2],row[3],row[4],row[5],row[6]));

                }
                else if(i==3)
                {
                    hvacStaffs.add(new HVACStaff(row[0],row[1],row[2],row[3],row[4],row[5],row[6]));
                }
                else if(i==4)
                {
                    electricityStaffs.add(new ElectricityStaff(row[0],row[1],row[2],row[3],row[4],row[5],row[6]));
                }
                else if(i==5)
                {
                    departmentSupervisorses.add(new DepartmentSupervisors(row[0],row[1],row[2],row[3],row[4]));
                }


            }
        }

        //Creating objects of CSVReader
        CSVReader audiovideoreader = new CSVReader(new FileReader(audiovideo), ',');
        CSVReader housekeepingreader = new CSVReader(new FileReader(housekeeping), ',');
        CSVReader securityreader = new CSVReader(new FileReader(security), ',');
        CSVReader hvacreader = new CSVReader(new FileReader(hvac), ',');
        CSVReader electricityreader = new CSVReader(new FileReader(electricity), ',');


    }
}
