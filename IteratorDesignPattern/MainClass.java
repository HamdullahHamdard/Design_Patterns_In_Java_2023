package IteratorDesignPattern;
//                                          Main Class for Iterator
public class MainClass {
    public static void main(String[] args) {
        CollectionOfNames company = new CollectionOfNames();
        for(Iterator iter = company.getIterator(); iter.hasNext();){
            String name = (String)iter.next();

            System.out.println("Name: "+name);
        }
        
    }
}



// class ordering

// 1: Iterator  
// 2: Container  
// 3: CollectionofNames 
// 4: MainClass