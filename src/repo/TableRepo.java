package repo;

import exception.TableAlreadyExists;
import model.Customer;
import model.Table;
import model.TableStatus;

import java.util.HashSet;

public class TableRepo {

    private  HashSet<Table> tableHashSet  = new HashSet<>();


    public void addTable(Table table){
        if (tableHashSet.contains(table)){
            throw new TableAlreadyExists();
        }
        tableHashSet.add(table);
    }

    public void markTableAsOccupied(Table table, Customer customer){
        table.setStatus(TableStatus.OCCUPIED);
        table.setCustomer(customer);
    }

    public void markTableAsUnOccupied(Table table){
        table.setStatus(TableStatus.UNOCCUPIED);
        table.setCustomer(null);
    }
}
