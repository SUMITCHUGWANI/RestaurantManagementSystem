package repo;

import model.Staff;

import java.util.HashSet;

public class StaffRepo {

    HashSet<Staff> staffHashSet = new HashSet<>();

    public void addStaff(Staff staff){
        staffHashSet.add(staff);
    }

    public boolean checkIfStaffExists(Staff staff){
        return staffHashSet.contains(staff);
    }

}
