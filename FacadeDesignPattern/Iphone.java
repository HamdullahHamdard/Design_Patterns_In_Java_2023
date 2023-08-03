package FacadeDesignPattern;

public class Iphone implements MobileShop {

    // ovveride th mobile shop interface methodes and set the name and price of iphone
    @Override
    public void modelNo() {
        System.out.println("Iphone 14 Pro Max");
    }

    @Override
    public void price() {
        System.out.println("RS: 1750$");
    }
    
}
