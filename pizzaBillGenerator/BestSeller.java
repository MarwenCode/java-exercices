package pizzaBillGenerator;

public class BestSeller extends Pizza {

    public BestSeller(boolean veg) {
        super(veg);
       
        
    }

    public void extraMethod() {
        addExtraCheese(); 
        addExtraToppings(); 
    }
    
}
