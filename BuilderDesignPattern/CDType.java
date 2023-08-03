package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    // get CD name and it price as list
    private List<Packing> items = new ArrayList<Packing>();
     
    public void addItems(Packing packs){
        items.add(packs);
    }
    public void getCosts(){
        for(Packing packs: items){
            packs.price();
        }
    }


    // show the name and price of CD
    public void showItems(){
        for(Packing packs : items){
            System.out.println("CD Name: "+ packs.pack()+" Price: "+packs.price());
        }
    }

    
}
