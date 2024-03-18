package Employees;

public class Waiter extends Employee{
private double tip;

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public Waiter(String name, String position, double salary) {
        super(name, position, salary);
    }

@Override
    public double getSalary() {
        return getSalary()+tip;
}
}


