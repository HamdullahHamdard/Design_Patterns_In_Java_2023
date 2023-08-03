package BuilderDesignPattern;

//                                          Main Class
public class MainClass {
    public static void main(String[] args) {
        
        // create object
        CDBuilder cdBuilder = new CDBuilder();

        // create and show sony CD
        CDType cdType1 = cdBuilder.buildSonyCD();
        cdType1.showItems();

        // create and show samsung CD
        CDType cdType2 = cdBuilder.buildSamsungCD();
        cdType2.showItems();
    }

}

// class ordering 

// 1: Packing  
// 2: CD  
// 3: Company  
// 4: Sony  
// 5: Samsung  
// 6: CDType  
// 7: CDBuilder  
// 8: MainClass 

