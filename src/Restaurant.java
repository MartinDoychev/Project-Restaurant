import Restaurant.FoodAndDrink.Food;

import java.util.Scanner;
public class Restaurant {
    private String name;
    private int stars;
    private double capital;


    //Default Constructor
    public Restaurant() {
        this.name = "JavaBite";
        this.stars = 2;
        this.capital = 15000.0;
    }

    //Constructor with parameters
    public Restaurant(String name, int stars, double capital) {
        setName(name);
        setStars(stars);
        setCapital(capital);
    }

    //Copy Constructor
    public Restaurant(Restaurant other) {
        this.name = other.name;
        this.stars = other.stars;
        this.capital = other.capital;
    }

    //Getters
    public String getName() {
        return this.name;
    }

    public int getStars() {
        return this.stars;
    }

    public double getCapital() {
        return capital;
    }

    //Setters
    public void setName(String name) {
        if ('A' <= name.charAt(0) && name.charAt(0) <= 'Z')
            this.name = name;

        else
        {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
            this.name = name;
        }
    }

    public void setStars(int stars) {
        if(stars < 0 || 5 < stars)
            this.stars = 0;

        else
            this.stars = stars;
    }

    public void setCapital(double capital) {
        if(this.capital < 0 || this.capital < 4000)
            this.capital = 4000;

        else
            this.capital = capital;
    }

    //method for ordering food
    public void orderFood () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert what would you like to order: \n1. Starter\n2. Main dish\n3. Dessert");
        short choice = scanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                Food food = new Food();
                food.choiceStarter();
                break;
            }

            case 2: {
                Food food = new Food();
                food.choiceMainDish();
                break;
            }

            case 3: {
                Food food = new Food();
                food.choiceDessert();
                break;
            }

            default: {
                System.out.println("Something went wrong");
                break;
            }
        }
    }


}

