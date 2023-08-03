package FactoryDesignPettern;

// plan for commercial buisnes
public class CommercialPlan extends Plan {

    // ovveride the getRate method of Plan
    @Override
    void getRate(){
        rate = 5.8;
    }
}
