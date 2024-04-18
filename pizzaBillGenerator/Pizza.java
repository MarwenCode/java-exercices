package pizzaBillGenerator;

public class Pizza {
    private int price;
    private Boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int dessertPrice = 50;
    private int drinkPrice = 40;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeayOpted = false;
    private boolean isTakedDessert = false;
    private boolean isDrinkTaked = false;

    private int basePizza;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        this.basePizza = this.price;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        // System.out.println("extra toppings added");
        this.price += extraToppingsPrice;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        // System.out.println("extra cheese added");
        this.price += extraCheesePrice;
    }

    public void takeAway() {
        isTakeayOpted = true;
        // System.out.println("take away");
        this.price += backPackPrice;
    }

    public void dessert() {
        isTakedDessert = true;
        this.price += dessertPrice;

    }
    public void drink() {
        isDrinkTaked = true;
        this.price += drinkPrice;

    }

    public void getBill() {
        String bill = "";

        System.out.println("Pizza based price " + basePizza);
   

        if(isExtraCheeseAdded) {
            bill += "Extra Cheese: $" + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings: $  " + extraToppingsPrice + "\n";

        }

        if (isDrinkTaked) {
            bill += "Drinks : " + drinkPrice + "\n"; 
            
        }


        if(isTakeayOpted) {
            bill += "Take Away Fee : $" + backPackPrice + "\n\n";

        }

        bill += "Bill  Amount : $" + this.price;

        System.out.println(bill);


    }

 




    
}
