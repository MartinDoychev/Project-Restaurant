package Restaurant.FoodAndDrink;

public class Product {
    private String name;
    private int amount;

    public Product() {
    }

    public Product(String name) {
        this.setName(name);
        this.setAmount(name);
        this.minusOneProduct();
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setName(String name) {
        if(name == "Salad")
            this.name = "Tomatoes, Cucumber, Lettuce, Corn";

        else if (name == "Chicken nuggets")
            this.name = "Chicken";

        else if(name == "French Fries")
            this.name = "Potatoes";

        else if(name == "Chicken breast with mushrooms and sauce")
            this.name = "Chicken, Mushrooms";

        else if(name == "Pork ribs with grilled potatoes")
            this.name = "Pork ribs, Potatoes";

        else if(name == "Sushi")
            this.name = "Salmon, Rice";

        else if(name == "Cheesecake")
            this.name = "Cream Cheese and Cookies";

        else if(name == "Pancake")
            this.name = "Flour, Eggs, Chocolate";

        else if(name == "Soufflè with a ball ice cream")
            this.name = "Chocolate, Ice cream balls";
    }

    public void setAmount(String name) {
        if(name == "Salad")
            this.amount = 0;

        else if (name == "Chicken nuggets")
            this.amount = 10;

        else if(name == "French Fries")
            this.amount = 15;

        else if(name == "Chicken breast with mushrooms and sauce")
            this.amount = 13;

        else if(name == "Pork ribs with grilled potatoes")
            this.amount = 2;

        else if(name == "Sushi")
            this.amount = 5;

        else if(name == "Cheesecake")
            this.amount = 7;

        else if(name == "Pancake")
            this.amount = 3;

        else if(name == "Soufflè with a ball ice cream")
            this.amount = 6;
    }
    public void minusOneProduct() {
        this.amount -= 1;
    }
}