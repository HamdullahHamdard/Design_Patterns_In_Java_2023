package SingletonDesignPattern;

public class MainClass {

    public static void main(String[] args) {
        // get instance without creating an object
        SingleObject single = SingleObject.getInstance();

        // show the method of this class
        single.show();

    }
    
}


// class ordering 

// 1: SingleObject  
// 2: MainClass 

