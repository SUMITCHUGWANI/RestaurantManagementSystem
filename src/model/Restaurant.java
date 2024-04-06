package model;

import java.util.Map;

public class Restaurant {

    private static int id = 0;
    private String name;
    private Menu menu;

    private int noOfTables;
    private Map<Integer, Table> tableMap;

    public Restaurant(String name, Menu menu, int noOfTables) {
        id += 1;
        this.name = name;
        this.menu = menu;
        this.noOfTables = noOfTables;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Restaurant.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public void setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
    }

    public Map<Integer, Table> getTableMap() {
        return tableMap;
    }

    public void setTableMap(Map<Integer, Table> tableMap) {
        this.tableMap = tableMap;
    }
}
