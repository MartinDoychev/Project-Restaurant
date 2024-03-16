package Employees;

import java.util.List;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private double tip = 0.0;
    private List<Waiter> waiters;
    private List<Bartender> bartenders;
    private List<Cook> cooks;
    private List<Cleaner> cleaners;


    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    public List<Waiter> getWaiters() {
        return waiters;
    }

    public void setWaiters(List<Waiter> waiters) {
        this.waiters = waiters;
    }

    public List<Bartender> getBartenders() {
        return bartenders;
    }

    public void setBartenders(List<Bartender> bartenders) {
        this.bartenders = bartenders;
    }

    public List<Cook> getCooks() {
        return cooks;
    }

    public void setCooks(List<Cook> cooks) {
        this.cooks = cooks;
    }

    public List<Cleaner> getCleaners() {
        return cleaners;
    }

    public void setCleaners(List<Cleaner> cleaners) {
        this.cleaners = cleaners;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Position: " + this.position + " Salary: " + String.format("%.2f", this.salary) + " $ ";
    }
}
