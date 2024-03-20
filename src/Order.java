import Employees.Waiter;
import Restaurant.FoodAndDrink.Drink.Drinks;
import Restaurant.FoodAndDrink.Food.Food;
import Restaurant.FoodAndDrink.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    private int id;
    private double price;
    private double tip;
    private double bill;
    private Waiter waiter;
    private Table table;

    List<Food> foods = new ArrayList<>();
    List<Drinks> drinks = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Order(Table table, Waiter waiter) {
        this.id = 0;
        this.price = 0;
        this.tip = 0;
        this.bill = 0;
        this.waiter = waiter;
        this.table = table;


    }

    public Table getTable() {
        return this.table;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {

        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public Waiter getWaiter() {
        return this.waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void addFood(Food item) {
        foods.add(item);
        price += item.getPrice();

    }

    public void addDrink(Drinks item) {
        drinks.add(item);
        price += item.getPrice();

    }

    public void takeOrder(Menu menu) {
        System.out.println("Do you want to order Food? Yes or No");
        String choice = scanner.nextLine();
        if ("Yes".equalsIgnoreCase(choice)) {
            System.out.println("Please select a food from the menu");
            while (true) {
                String itemFood = scanner.nextLine();
                if (itemFood.isEmpty()) {
                    break;
                }
                for (Food food :
                        menu.getFoods()) {
                    if (food.getName().equalsIgnoreCase(itemFood)) {
                        addFood(food);
                    }

                }
            }
        }
        System.out.println("Do you want to order Drinks? Yes or No");
        choice = scanner.nextLine();
        if ("Yes".equalsIgnoreCase(choice)) {
            System.out.println("Please select a drink from the menu");
            while (true) {
                String itemDrink = scanner.nextLine();
                if (itemDrink.isEmpty()) {
                    break;
                }
                for (Drinks drinks :
                        menu.getDrinks()) {
                    if (drinks.getName().equalsIgnoreCase(itemDrink)) {
                        addDrink(drinks);
                    }

                }
            }
        }

    }

    public void calculateTip() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Will you leave a 10% tip?");
        String tipYesOrNo = scanner.nextLine();
        if (tipYesOrNo.equalsIgnoreCase("yes")) {
            tip = price * 0.1;
            bill = price + tip;
        } else {
            tip = 0;
            bill = price;
        }
        if (waiter != null) {
            waiter.addTips(tip);
            waiter.addTotalOrder(price);
        }
        System.out.printf("Your bill is %.2f $", bill);

    }


}
