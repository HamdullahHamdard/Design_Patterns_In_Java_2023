package FacadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//                                                          Main Class for Facade DP
public class MainClass {

    public static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("============= Mobile Shop =============");
                System.out.println("    1: Iphone");
                System.out.println("    2: Samsung");
                System.out.println("    3: Exit");

                ShopKeeper shopKeeper = new ShopKeeper();
                

                choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 1:
                        shopKeeper.iphoneSale();
                        break;
                    case 2:
                        shopKeeper.samsungSale();
                        break;
                
                    default:
                        System.out.println("There is nothing while loading\n--------------------------------------------");
                        break;
                }
            
            

        } while (choice!=3);
    }
}


// class ordering

// 1: MobileShop  
// 2: Iphone 
// 3: Samsung 
// 4: ShopKeeper 
// 5: MainClass
