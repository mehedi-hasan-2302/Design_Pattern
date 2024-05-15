package Pizza_Toppings;


public class VegetarianPizza extends Pizza {
    @Override
    public void addTopping(String topping) {

        // Vegetarian pizza has vegetables, cheese, and tomato as toppings
        System.out.println("Adding " + topping + " to Vegetarian pizza");
    }
}
