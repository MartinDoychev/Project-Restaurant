
import Employees.Employee;
import Employees.EmployeеList;
import Employees.Waiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customer extends Employee {
    private int id = 1;
    private Order order;
    private String NAME;


    private Table table;

    Scanner scanner = new Scanner(System.in);

    public Customer(String name, boolean tip) {
        NAME = name;

    }

    public Customer() {
    }

    public String getNAME() {
        return NAME;
    }

    public void assignWaitersToCustomers() {
        Table table = new Table();
        table.Seats();
        int tableCount = table.getNumberTable();
        EmployeеList employeеList=new EmployeеList();
        List<Employee> waiters = new ArrayList<>();
        for (Employee employee :employeеList.getEmployee()) {
            if (employee instanceof Waiter) {
                waiters.add(employee);
            }
        }

        for (int i = 1; i < tableCount; i++) {
                Employee waiter = waiters.get(i % waiters.size());
                System.out.printf("Hello, you are served by a %s, with an order number %d for the day.\n", waiter.getName(), id++);

        }


    }

}
