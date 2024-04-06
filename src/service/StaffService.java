package service;

import exception.CustomerDoesNotExists;
import exception.StaffDoesNotExists;
import model.Customer;
import model.Staff;
import model.Table;
import repo.CustomerRepo;
import repo.StaffRepo;
import repo.TableRepo;

public class StaffService {

    TableRepo tableRepo;

    CustomerRepo customerRepo;

    StaffRepo staffRepo;

    public StaffService(TableRepo tableRepo, CustomerRepo customerRepo, StaffRepo staffRepo) {
        this.staffRepo = staffRepo;
        this.customerRepo = customerRepo;
        this.tableRepo = tableRepo;
    }

    public void markTableAsOccupied(Table table, Staff staff, Customer customer){
        if (!customerRepo.checkIfCustomerExists(customer)){
            throw new CustomerDoesNotExists();
        }
        if (!staffRepo.checkIfStaffExists(staff)){
            throw new StaffDoesNotExists();
        }

        tableRepo.markTableAsOccupied(table, customer);
        System.out.println("table is marked to customer "+ customer.getName());

    }

    public void markTableAsUnoccupied(Staff staff, Table table){
        if (!staffRepo.checkIfStaffExists(staff)){
            throw new StaffDoesNotExists();
        }
        tableRepo.markTableAsUnOccupied(table);
    }

    public void addTable(Table table){
        tableRepo.addTable(table);
    }




}
