package FacadeDesignPattern;

public class ShopKeeper {

    // shop keeper have iphone and samsung mobile
    private MobileShop iphone;
    private MobileShop samsung;

    public ShopKeeper(){
        // assign this objects to private objects
        iphone = new Iphone();
        samsung = new Samsung();
    }

    // if user want iphone call to this method
    public void iphoneSale(){
        // pass object of the model and price of iphone to mobile shop
        iphone.modelNo();
        iphone.price();
    }

    // if user want samsung call to this method
    public void samsungSale(){
        // pass object of the model and price of samsung to mobile shop
        samsung.modelNo();
        samsung.price();
    }
    
}
