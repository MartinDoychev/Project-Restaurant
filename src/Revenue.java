import Employees.Waiter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Revenue {
    private List<Order> orders = new ArrayList<>();
    private Map<Table, Double> revenueByTable = new HashMap<>();
    private Map<Waiter, Double> tipsByWaiter = new HashMap<>();

    public void addOrder(Order order) {
        orders.add(order);
        Table table = order.getTable();
        Waiter waiter = order.getWaiter();
        revenueByTable.merge(table, order.getPrice(), Double::sum);
        tipsByWaiter.merge(waiter, order.getPrice(), Double::sum);
    }
    public  void  addTip(Waiter waiter,double tip){
        tipsByWaiter.merge(waiter,tip,Double::sum);
    }
    public double getTotalTips(Waiter waiter){
        return tipsByWaiter.getOrDefault(waiter,0.0);
    }

    public double totalRevenue() {
        double revenue = 0;
        for (Order order : orders) {
            revenue += order.getPrice() + order.getTip();
        }

        return revenue;
    }

    public void revanueAndTips() {

        for (Map.Entry<Table, Double> entry : revenueByTable.entrySet()) {
            Table table = entry.getKey();
            Double revenue = entry.getValue();
            System.out.printf("Table %s Income: %.2f\n",table.getId(),revenue);
        }

            for (Map.Entry<Waiter, Double> entry : tipsByWaiter.entrySet()) {
                Waiter waiter = entry.getKey();
                Double tips = entry.getValue();
                System.out.printf("Table %s Income: %.2f\n",waiter.getName(),tips);
            }
        }


    public double totalTips() {
        double totalTips = 0;
        for (Order order : orders) {
            totalTips += order.getTip();
        }
        return totalTips;
    }

    public void totalWaiterTips() {
        Map<Waiter, Double> waiterTips = new HashMap<>();
        for (Order order : orders
        ) {
            Waiter waiter = order.getWaiter();
            waiterTips.putIfAbsent(waiter, 0.0);
            waiterTips.put(waiter, waiterTips.get(waiter) + order.getTip());

        }
        for (Map.Entry<Waiter, Double> entry : waiterTips.entrySet()) {
            Waiter waiter = entry.getKey();
            Double tips = entry.getValue();
            System.out.printf("The waitress %s has a tip of the day: %.2f. \n", waiter.getName(), tips);
        }
    }

}
