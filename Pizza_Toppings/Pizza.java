package Pizza_Toppings;


public abstract class Pizza {

    // Method to add a topping to the pizza
    public abstract void addTopping(String topping);

    // Method to prepare the pizza
    public void prepare() {
        System.out.println("Preparing pizza...");
    }

}
