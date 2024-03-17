package Employees;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeеMain {
    public static List<Employee> employee = new ArrayList<>();

    public static void main(String[] args) {
        employee.add(new Waiter("Emily Carter", "Waiter", 1100));
        employee.add(new Waiter("Michael Smith", "Waiter", 1400));
        employee.add(new Waiter("Dimitur Georgiev", "Waiter", 1400));
        employee.add(new Bartender("James Williams", "Bartender", 1600));
        employee.add(new Bartender("Victoria Simeonova", "Bartender", 1600));
        employee.add(new Cook("Olivia Brown", "Cook", 1800));
        employee.add(new Cook("Ethan Davis", "Cook", 1800));
        employee.add(new Cleaner("Charlotte Wilson", "Cleaner", 1000));
        employee.add(new Cleaner("Isabella Thompson", "Cleaner", 1000));
        for (Employee employee : employee) { //за да може всеки да е на нов ред
            System.out.println(employee);
        }

    }

}
   /* Bartender bartenderJames = new Bartender("James Williams", "Bartender", 1600);
    Bartender bartenderVictoria = new Bartender("Victoria Simeonova", "Bartender", 1600);
    Cook cookOlivia = new Cook("Olivia Brown", "Cook", 1800);
    Cook cookEthan = new Cook("Ethan Davis", "Cook", 1800);
    Cleaner cleanerCharlotte = new Cleaner("Charlotte Wilson", "Cleaner", 1000);
    Cleaner cleanerIsabella = new Cleaner("Isabella Thompson", "Cleaner", 1000);*/
