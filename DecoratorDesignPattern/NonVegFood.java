package DecoratorDesignPattern;

//                                      name and price of veg food with non veg Food

public class NonVegFood extends FoodDecorator {

    // get Food as Parameter
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood()+" With Rice and Kabob: ";
    }
    public double foodPrice(){
        return super.foodPrice()+300;
    }
    
    
}
