package FactoryDesignPettern;


// plan for internal flight
public class DomosticPlan extends Plan {

    // ovveride the getRate method from plan interface
    @Override
    void getRate() {
        rate = 3.5;
    }
    
}
