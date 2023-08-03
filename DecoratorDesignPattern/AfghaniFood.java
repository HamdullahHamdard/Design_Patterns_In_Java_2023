package DecoratorDesignPattern;


//                                      name and price of veg food with afghani food
public class AfghaniFood extends FoodDecorator {
    public AfghaniFood(Food newFood){
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood()+" With Kabob and beauty Milk: ";
    }
    public double foodPrice(){
        return super.foodPrice()+5000;
    }
}
