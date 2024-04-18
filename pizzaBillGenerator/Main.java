package pizzaBillGenerator;

public class Main {

    public static void main(String[] args) {
         Pizza basePizza = new Pizza(true);
        //  basePizza.getPizzaPrice();
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.drink();
        basePizza.getBill();

        // BestSeller bestSel = new BestSeller(true);
        // bestSel.extraMethod();
        // bestSel.getBill();



    }
    
}
