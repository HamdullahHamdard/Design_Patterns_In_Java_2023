package BuilderDesignPattern;

public abstract class CD implements Packing {
   
    // ovveride the pack method for Packing interface
    // CD has pack
    @Override
    public abstract String pack();
}
