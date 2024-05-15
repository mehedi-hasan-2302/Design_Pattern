package Pizza_Toppings;


public class PepperoniPizza extends Pizza {
    @Override
    public void addTopping(String topping) {

        // Pepperoni pizza has pepperoni, cheese, and tomato as toppings
        System.out.println("Adding " + topping + " to Pepperoni pizza");
    }
}

