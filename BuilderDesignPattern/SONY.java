package BuilderDesignPattern;

public class SONY extends Company {

    // ovveride the pack and price method for Company class
    @Override
    public int price() {
        return 50;
    }

    @Override
    public String pack() {
        return "SONY CD";
    }
    
}
