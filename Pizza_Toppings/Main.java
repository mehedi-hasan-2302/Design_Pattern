package Pizza_Toppings;

public class Main {
    public static void main(String[] args) {

        // Creating a Pepperoni pizza and adding toppings
        Pizza pepperoni = new PepperoniPizza();
        pepperoni.prepare();
        pepperoni.addTopping("cheese");
        pepperoni.addTopping("tomato");
        pepperoni.addTopping("pepperoni");


        System.out.println();

        // Creating Vegetarian pizza and adding toppings
        Pizza vegetarian = new VegetarianPizza();
        vegetarian.prepare();
        vegetarian.addTopping("cheese");
        vegetarian.addTopping("tomato");
        vegetarian.addTopping("vegetables");

    }
}
