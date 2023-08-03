package AdapterDesignPattern;

public class MainClass {
    public static void main(String[] args) {

        CreditCard target = new BankCustomer();
        target.giveBankDetails();
        System.out.println(target.getCreditCard());
    }
}


// class ordering 

// 1: CreditCard
// 2: BankDetails 
// 3: BankCustomer  
// 4: MainClass 

