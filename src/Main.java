import Employees.Employee;
import Employees.EmployeеList;
import Employees.Waiter;
import Restaurant.FoodAndDrink.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
  Restaurant obj = new Restaurant("JavaBite", 4, 21000);
  Menu menu = new Menu();
  Revenue revenue=new Revenue();
  EmployeеList employeеList = new EmployeеList();
  List<Table> tables = new ArrayList<>();




    Table seatsTable=new Table(null);
        int numberTable=seatsTable.Seats();
        seatsTable.Seats();
        menu.printMenu();
    List<Waiter> waiters = new ArrayList<>();
        for (Employee employee : employeеList.getEmployee()) {
            if (employee instanceof Waiter) {
                waiters.add((Waiter) employee);
   }
  }
        if (!waiters.isEmpty()) {
            for (int i = 1; i <= numberTable; i++) {
                Waiter assignedWaiter = waiters.get((i-1) % waiters.size());
                Table newTable = new Table(assignedWaiter);
                newTable.setNextId(i +1);
                tables.add(newTable);
   }
  }
        else{
        System.out.println("Няма налични сервитьори за назначаване към масите.");
  }

  for (Table table:tables) {
       System.out.printf("Table %d, Waiter: %s. \n",table.getId(),table.getWaiter().getName());
       table.takeOrderFromTable(menu,table.getWaiter());
       table.printBill();
       revenue.addRevenue(table.gettotalBill());
  }

  for (Waiter waiter:waiters) {
        System.out.printf("Waiter %s collected tips: %.2f%n ",waiter.getName(),waiter.getTotalTip());
  }

        System.out.printf("Total Revenue: %.2f%n",revenue.gerNetRevenue());
    scanner.close();
 }
}