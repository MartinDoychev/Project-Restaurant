import Employees.Employee;
import Employees.EmployeеList;
import Employees.Waiter;
import Restaurant.FoodAndDrink.Menu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeеList employeеList = new EmployeеList();
        List<Employee> employees = employeеList.getEmployee();
        Waiter selectedWaiter = null;
        for (Employee employee : employees) {
            if (employee instanceof Waiter) {
                selectedWaiter = (Waiter) employee;
                break;
            }
        }
        Table table = new Table();
        Customer customer = new Customer();
        customer.assignWaitersToCustomers();
        Restaurant obj = new Restaurant("JavaBite", 4, 21000);
        //obj.orderFood();
        Menu menu = new Menu();
        Order order = new Order(table, selectedWaiter);
        order.takeOrder(menu);
        order.calculateTip();
        Revenue revenue = new Revenue();
        revenue.revanueAndTips();


    }
}
