package SingletonDesignPattern;

public class SingleObject {

    // create private object of this class that we can not access any where
    private static SingleObject instance = new SingleObject();

    // create pravite constractor that we can not create object of this class because the constractor is private
    private SingleObject(){}

    // return the instance of this class
    public static SingleObject getInstance(){
        return instance;
    }

    // call by instance of this class to this method
    public void show() {
        System.out.println("Hello World!!!");        
    }
 
}
