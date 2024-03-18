import Restaurant.FoodAndDrink.Drink.Drinks;
import Restaurant.FoodAndDrink.Food.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order  {

    private int id;
    private double price;
    private  double tip;
    private double bill;
    
    List<Food>foods=new ArrayList<>();
    List<Drinks>drinks=new ArrayList<>();

    public Order() {
        this.id = id;
        this.price=price;
        this.tip=price*0.1;
        this.bill = bill;


    }
    public void totalPrice(double totalPrice){
        totalPrice=0;

        for (Food food:
             foods) {
         totalPrice+= food.getPrice();
        }
    }
    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {

        this.tip =tip;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
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

    public void calculateTip(){

        Scanner scanner=new Scanner(System.in);
        double tip=0;
        System.out.println("Will you leave a 10% tip?");
        String tipYesOrNo=scanner.nextLine();
        if (tipYesOrNo.equalsIgnoreCase("yes")){
            bill=price+tip;
        }else  {
            bill=price;
        }
        System.out.printf("Your bill is %.2f $",bill);
    }

}
