import java.util.ArrayList;
import java.util.List;

public class Table {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static final int TABLE = 11;
    private static final int TABLE_SEATS_SMALL = 4;
    private static final int TABLE_SEATS_MEDIUM = 4;
    private static final int TABLE_SEATS_LARGE = 3;
    private int customers;
    private int group;
    private int numberTable = 1;
    private double totalBill=0;
    private List<Order>orders=new ArrayList<>();
    public Table() {
        this.customers = customers;
        this.group = group;
        this.numberTable = numberTable;
        this.id=id;
    }

    public int getCustomers() {
        return customers;
    }

    public void setCustomers(int customers) {
        this.customers = customers;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumberTable() {
        return numberTable;
    }

    public void setNumberTable(int numberTable) {
        this.numberTable = numberTable;
    }

    public double gettotalBill() {
        return totalBill;
    }

    public void settotalBill(double totalBill) {
        totalBill = totalBill;
    }
    public void addTotalBill(double orderPrice){
        this.totalBill+=orderPrice;
    }
    public void addOrder(Order order){
        this.orders.add(order);
        this.totalBill+= order.getBill();
    }
    public List<Order> getOrder(){
        return orders;
    }
    public void Seats() {
        int min = 15;
        int max = 80;
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
    public void  printBill(){
        double totalBill=0;
        System.out.println("Table"+getId()+"Bill: ");
        for (Order order:orders
             ) {
            System.out.printf("Order ID: %d, Price: %.2f, Tip:%,2f\n ",order.getId(),order.getPrice(),order.getTip());
            totalBill+=order.getBill();

        }
        System.out.printf("Total Bill for Table %d: %.2f:\n " ,getId(),totalBill);
    }
}
