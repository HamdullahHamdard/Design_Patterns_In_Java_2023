package DecoratorDesignPattern;

import java.util.Scanner;
//                                                      Main Class
public class MainClass {

    public static int choice;


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do{
                System.out.println("\n\n============================= Food Menu =============================");
                System.out.print("            1. Vegetarian Food.   \n");  
                System.out.print("            2. Non-Vegetarian Food.\n");  
                System.out.print("            3. Afghani Food.         \n");  
                System.out.print("            4. Exit                        \n");  
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        VegFood vg= new VegFood();
                        System.out.print(vg.prepareFood());
                        System.out.print(": "+vg.foodPrice());
                        
                        
                        break;
                    case 2:
                        Food f1 = new NonVegFood((Food) new VegFood());
                        System.out.print(f1.prepareFood());
                        System.out.print(f1.foodPrice());

                        break;
                    case 3:
                        Food f2 = new AfghaniFood((Food) new VegFood());
                        System.out.print(f2.prepareFood());
                        System.out.print(f2.foodPrice());
                        break;
                
                    default:
                        System.out.println("Other than these no food available");
                        break;
                }

            }while(choice!=4);
        }

    }
}


// class ordering

// 1: Food 
// 2: VegFood 
// 3: FoodDecorator 
// 4: NonVegFood 
// 5: AfghaniFood 
// 6: MainClass
