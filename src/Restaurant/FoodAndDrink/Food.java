package Restaurant.FoodAndDrink;
import java.util.Scanner;
public class Food {
    private String name;
    private int portion;
    private double price;
    private Product product;

    private Scanner starterScanner = new Scanner(System.in);
    private Scanner mainDishScanner = new Scanner(System.in);
    private Scanner dessertScanner = new Scanner(System.in);

    public Food() {
        this.product = new Product();
    }

    public String getName() {
        return this.name;
    }

    public int getPortion() {
        return this.portion;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public void setPortion(int portion1) {
        this.portion = portion1;
    }

    public void setPrice(double price1) {
        this.price = price1;
    }

    public Product getProduct() {
        return this.product;
    }

    public void print() {
        System.out.println("Choice: " + this.getName() + "\nDish portion: " + this.getPortion() + "\nPrice: " + this.getPrice() + '\n');
        System.out.println("Product: " + this.product.getName() + "\nAmount left: " + this.product.getAmount() + '\n');
    }

    public void choiceStarter(){
        System.out.println("What would you like better:\n1. Salad\n2. Chicken nuggets\n3. French fries");
        short choice = starterScanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Salad");
                this.setPortion(350);
                this.setPrice(6.5);
                this.product = new Product("Salad");
                this.print();

                break;
            }

            case 2: {
                this.setName("Chicken nuggets");
                this.setPortion(250);
                this.setPrice(7.5);
                this.product = new Product("Chicken nuggets");
                this.print();

                break;
            }

            case 3: {
                this.setName("French fries");
                this.setPortion(300);
                this.setPrice(5.4);
                this.product = new Product("French fries");
                this.print();

                break;
            }

            default: {
                System.out.println("Something went wrong");
                break;
            }
        }

        starterScanner.close();
    }

    public void choiceMainDish(){
        System.out.println("What would you like better:\n1. Chicken breast with mushrooms and sauce\n2. Pork ribs with grilled potatoes\n3. Sushi");
        short choice = mainDishScanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Chicken breast with mushrooms and sauce");
                this.setPortion(400);
                this.setPrice(17.95);
                this.product = new Product("Chicken breast with mushrooms and sauce");
                this.print();

                break;
            }

            case 2: {
                this.setName("Pork ribs with grilled potatoes");
                this.setPortion(350);
                this.setPrice(19.05);
                this.product = new Product("Pork ribs with grilled potatoes");
                this.print();

                break;
            }

            case 3: {
                this.setName("Sushi");
                this.setPortion(300);
                this.setPrice(20.0);
                this.product = new Product("Sushi");
                this.print();

                break;
            }

            default: {
                System.out.println("Something went wrong");
                break;
            }
        }

        mainDishScanner.close();
    }

    public void choiceDessert(){
        System.out.println("What would you like better:\n1. Cheesecake\n2. Pancake\n3. Soufflè with a ball ice cream");
        short choice = dessertScanner.nextShort();
        System.out.println();

        switch (choice) {
            case 1: {
                this.setName("Cheesecake");
                this.setPortion(150);
                this.setPrice(10.75);
                this.product = new Product("Cheesecake");
                this.print();

                break;
            }

            case 2: {
                this.setName("Pancake");
                this.setPortion(250);
                this.setPrice(8.45);
                this.product = new Product("Pancake");
                this.print();

                break;
            }

            case 3: {
                this.setName("Soufflè with a ball ice cream");
                this.setPortion(170);
                this.setPrice(13);
                this.product = new Product("Soufflè with a ball ice cream");
                this.print();

                break;
            }

            default: {
                System.out.println("Something went wrong");
                break;
            }
        }

        dessertScanner.close();
    }
}