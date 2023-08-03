package FactoryDesignPettern;

public class GetPlanFactory {


    // check which plan do you want for flight
    public Plan getPlace(String planType){
        if(planType == null)
        {
            return null;
        }
        if(planType.equalsIgnoreCase("Domostic")){
            return new DomosticPlan();
        }
        if(planType.equalsIgnoreCase("Commercial")){
            return new CommercialPlan();
        }
        if(planType.equalsIgnoreCase("Personal")){
            return new PersonalPlan();
        }
        return null;


    }
    
}
