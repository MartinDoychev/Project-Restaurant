import Employees.Employee;
import Employees.EmployeеMain;
import Employees.Waiter;

import java.util.List;
import java.util.Scanner;

public class Customer extends Employee {
    private  int id;
    private  String NAME;

    public Customer(String name, boolean tip) {
        NAME = name;

    }

    public Customer() {
    }

    public String getNAME() {
        return NAME;
    }
public static void listEmployee(){
        List<Employee>employees=EmployeеMain.employee;
        int min = 15;
        int max = 100;
        int customer = (int) Math.floor(Math.random() * (max - min + 1) + min);
    for (int i = 1; i <customer ; i++) {

    }
    }
    public void customerHisWaiter() {
        Scanner scanner=new Scanner(System.in);
        int min = 15;
        int max = 100;
        int customer = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(customer);

        for (int i = 1; i <=customer ; i++) {
            if (i%3 == 1) {
                i=id;
                System.out.println("What is your name?");
                System.out.println("Waiter1" + id);
            }else if (i%3 == 2) {
                i=id;
                System.out.println("Waiter2 " + id);
            }else {
                i=id;
                System.out.println("Waiter3 " + id);
            }

        }

        
    }

}
