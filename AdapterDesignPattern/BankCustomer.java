package AdapterDesignPattern;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard {


    // get name and account numbers from bank customers
    @Override
    public void giveBankDetails() {
        
            try (Scanner scanner = new Scanner(System.in)) {
                // get customer name
                System.out.print("Enter the account holder name: ");
                String customerName = scanner.nextLine();
                System.out.println("");

                // get customer account number
                System.out.print("Enter the account number: ");
                long accNo = scanner.nextInt();
                System.out.println("");

                // get customer related bank
                System.out.print("Enter the bank name: ");
                String bankName = scanner.nextLine();


                // set this propreites to Bank Details class
                setAccHolderName(customerName);
                setAccNumber(accNo);
                setBankName(bankName);
            }

         catch (Exception e) {
            e.printStackTrace();
        }
    }


    // show the info of customers
    @Override
    public String getCreditCard() {
        long accNo = getAccNumber();
        String accHolderName = getAccHolderName();
        String bankName = getBankName();
        
        return ("The Account number "+accNo+" of "+accHolderName+" in "+bankName+" Bank is valid and authenticated for issuing the creadit card");

    }

    
}
