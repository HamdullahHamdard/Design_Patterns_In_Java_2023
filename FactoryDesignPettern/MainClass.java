package FactoryDesignPettern;

import java.util.Scanner;


//                              the main class of factory design pattern
public class MainClass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GetPlanFactory getPlanFactory = new GetPlanFactory();
       
        System.out.print("Enter the plan name: ");

        String planName = scanner.nextLine();
        System.out.print("Enter the Numbers: ");
        int units = scanner.nextInt();
        
        Plan p = getPlanFactory.getPlace(planName);

        System.out.print("Bill Amount for "+planName+" of "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);

        scanner.close();
    }
}

// class ordering 

// 1: Plan
// 2: DomesticPlan  
// 3: CommercialPlan   
// 4: PersonalPlan  
// 5: GetPlanFactory  
// 6: MainClass  

