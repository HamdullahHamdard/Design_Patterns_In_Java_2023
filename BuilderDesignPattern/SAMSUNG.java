package BuilderDesignPattern;

public class SAMSUNG extends Company {

    // ovveride the pack and price method for Company class
    @Override
    public int price() {
        return 90;
    }

    @Override
    public String pack() {
        return "SAMSUNG CD";
    }
    
}
