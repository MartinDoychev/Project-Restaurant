import Employees.Employee;
import Employees.EmployeеList;

import java.util.List;
import java.util.Scanner;

public class Customer extends Employee {
    private int id = 1;
    private static final int TABLE = 11;
    private static final int TABLE_SEATS_SMALL = 4;
    private static final int TABLE_SEATS_MEDIUM = 4;
    private static final int TABLE_SEATS_LARGE = 3;

    private String NAME;
    private int customers;
    private int group;

    Scanner scanner = new Scanner(System.in);

    public Customer(String name, boolean tip) {
        NAME = name;

    }

    public Customer() {
    }

    public String getNAME() {
        return NAME;
    }

    public static void listEmployee() {
        List<Employee> employees = EmployeеList.employee;


    }

    public void Seats() {
        int min = 15;
        int max = 80;
        int numberTable = 1;
        int sum = 0;
        int availableSeats = TABLE * (TABLE_SEATS_LARGE + TABLE_SEATS_MEDIUM + TABLE_SEATS_SMALL);
        this.customers = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Total customers " + this.customers);
        while (this.customers > 0) {
            int minGroup = 1;
            int maxGroup = 8;

            this.group = (int) Math.floor(Math.random() * (maxGroup - minGroup + 1) + minGroup);
            System.out.println("Group size " + this.group);
            if (TABLE < numberTable) {
                System.out.println("No free tables, come another day!");
                return;
            }

            if (this.group <= 4) {
                System.out.println("You are at a table for four, number table" + numberTable);
                this.customers -= 4;
            } else if (this.group <= 6) {
                System.out.println("You are at a table for six, number table" + numberTable);
                this.customers -= 6;

            } else if (this.group <= 8) {
                System.out.println("You are at a table for eight, number table " + numberTable);
                this.customers -= 8;
            }
            System.out.println("Customers"+this.customers);
            numberTable++;

        }
        if (this.customers >= availableSeats) {
            System.out.println("No free tables, come another day!");
        }
    }

    public void assignWaitersToCustomers() {

        for (int i = 1; i <= this.customers; i++) {
            if (i % 3 == 1) {
                i = id;
                System.out.println("What is your name?");
                String name = scanner.nextLine();
                System.out.println("Waiter1" + id);
            } else if (i % 3 == 2) {
                System.out.println("What is your name?");
                String name = scanner.nextLine();
                i = id;
                System.out.println("Waiter2 " + id);
            } else {
                System.out.println("What is your name?");
                String name = scanner.nextLine();
                i = id;
                System.out.println("Waiter3 " + id);
            }

        }


    }

}
