package FactoryDesignPettern;

public class PersonalPlan extends Plan {

    // ovveride the getRate method of Plan interface 
    @Override
    void getRate(){
        rate = 9.4;
    }
}
