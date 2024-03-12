package Restaurant.FoodAndDrink;
import java.util.Scanner;

public class Drinks {

    private String name;
    private int quantities;
    private double price;
    private int numberOfDrinks;

    private Scanner hotDrinks = new Scanner(System.in);
    private Scanner coldDrinks = new Scanner(System.in);
    private Scanner alcoholicDrinks = new Scanner(System.in);

    public String getName(){
        return this.name;
    }

    public int getNumberOfDrinks(){
        return this.getNumberOfDrinks();
    }

    public void setNumberOfDrinks() {
        if (this.name == "Coffee")
            this.numberOfDrinks = 5;

        else if (this.name == "Tea")
            this.numberOfDrinks = 7;

        else if (this.name == "Hot Chocolate")
            this.numberOfDrinks = 4;

        else if (this.name == "Water")
            this.numberOfDrinks = 12;

        else if (this.name == "Cola")
            this.numberOfDrinks = 14;

        else if (this.name == "Juice")
            this.numberOfDrinks = 8;

        else if (this.name == "Beer")
            this.numberOfDrinks = 12;

        else if (this.name == "Whiskey")
            this.numberOfDrinks = 7;

        else if (this.name == "Vodka")
            this.numberOfDrinks = 6;

        else if (this.name == "Martini")
            this.numberOfDrinks = 4;
    }

    private boolean checkAvailability() {

        return this.numberOfDrinks > 0;
    }

    public Drinks(short num) {
        if (num == 1)
            choiceOfHotDrinks();
        else if (num == 2)
            choiceOfColdDrinks();
        else if (num == 3)
            choiceOfAlcoholicDrinks();
    }

    public void choiceOfAlcoholicDrinks() {

        System.out.println("What would you like to drink:\n1.Beer\n2.Whiskey\n3.Vodka\n4.Martini");
        short choice = alcoholicDrinks.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                if (checkAvailability()) {
                    this.name = "Beer";
                    this.price = 3.50;
                    this.quantities = 12;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 2: {
                if (checkAvailability()) {
                    this.name = "Whiskey";
                    this.price = 6.50;
                    this.quantities = 7;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 3: {
                if (checkAvailability()) {
                    this.name = "Vodka";
                    this.price = 5.60;
                    this.quantities = 6;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 4: {
                if (checkAvailability()) {
                    this.name = "Martini";
                    this.price = 8.90;
                    this.quantities = 4;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
        }
    }
    public void choiceOfHotDrinks() {
        System.out.println("What would you like to drink:\n1.Coffee\n2.Tea\n3.Hot Chocolate");
        short choice = hotDrinks.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                if (checkAvailability()) {
                    this.name = "Coffee";
                    this.price = 2.75;
                    this.quantities = 5;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 2: {
                if (checkAvailability()) {
                    this.name = "Tea";
                    this.price = 3.25;
                    this.quantities = 7;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 3: {
                if (checkAvailability()) {
                    this.name = "Hot Chocolate";
                    this.price = 2.90;
                    this.quantities = 4;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
        }
    }

    public void choiceOfColdDrinks() {
        System.out.println("What would you like to drink:\n1.Water\n2.Cola\n3.Juice");
        short choice = coldDrinks.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                if (checkAvailability()) {
                    this.name = "Water";
                    this.price = 2.00;
                    this.quantities = 12;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 2: {
                if (checkAvailability()) {
                    this.name = "Cola";
                    this.price = 2.50;
                    this.quantities = 14;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
            case 3: {
                if (checkAvailability()) {
                    this.name = "Juice";
                    this.price = 3.40;
                    this.quantities = 8;
                    numberOfDrinks -= 1;
                } else
                    System.out.println("There are none left :(");

                break;
            }
        }

    }
}