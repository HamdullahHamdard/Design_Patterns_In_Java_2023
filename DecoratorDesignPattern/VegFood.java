package DecoratorDesignPattern;


//                                      name and price of veg food
public class VegFood implements Food {

    @Override
    public String prepareFood() {
        return "Veg Food";
    }

    @Override
    public double foodPrice() {
        return 200;
    }
}
