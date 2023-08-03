package FacadeDesignPattern;

public class Samsung implements MobileShop{

    // ovveride th mobile shop interface methodes and set the name and price of Samsung
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy S23 Ultra");
    }

    @Override
    public void price() {
        System.out.println("RS: 1050$");
    }
    
}
