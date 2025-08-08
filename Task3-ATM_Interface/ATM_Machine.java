import java.util.*;

public class ATM_Machine {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Krishna Prime Bank!");

        //  I WANTED TO USE Try and Catch 
        try{
        System.out.println("Enter your Account Number: ");      // Just asking for more User interaction
        sc.nextLong();
        }catch(InputMismatchException e){
            System.out.println("Please enter numeric values only. ");
            sc.next();
        }
        
        try{
        System.out.println("Enter your PIN (4 digit): ");       // Just asking for User interaction
        sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Please enter numeric values only. ");
            sc.next();
        }

        
        Account acc = null;
        while(acc==null){    //Loop till user enter its account
        System.out.println("Enter your Account Type (saving / current): ");

        String accType = sc.next().toLowerCase();

        if(accType.equals("saving")){
         acc = new saving();
        }
        else if(accType.equals("current")){
         acc = new current();
        }else{

            System.out.println("Invalid Account Type! TRY AGAIN");
            
        }
    }

        boolean open = true;
            while (open) {      // Entering Transaction Portal

                System.out.println("Press 1 to withdraw, 2 to deposit, 3 to check balance and 0 to exit:");
                int input = sc.nextInt();
                if(input==1) {
                    System.out.println("Enter the amount to withdraw: ");
                    acc.withdraw(sc.nextInt());
                }
                else if(input==2) {
                    System.out.println("Enter the amount to deposit: ");
                    acc.deposit(sc.nextInt());
                }
                else if(input==3) {
                    System.out.println("Your current balance is: "+acc.checkBalance());
                    
                }else{
                    open=false;     //Exiting 
                }

            }
      System.out.println("Thank you for banking with Krishna Prime Bank!");
      sc.close();
    }   
}


abstract class Account{          // Abstract class
    private int bal;

    Account(){
        this.bal=5000;         //Minimum amount every account has when creating any Bank Account
    }
    
    public int getBal(){       // Getter 
        return this.bal;
    }

    public void setBal(int bal){    // Setter
        this.bal = bal;
    }

    abstract void withdraw(int amount);      // Abstract method 

     void deposit(int amount){              //Universal deposit method
        if(amount<0) {
            System.out.println("Invalid amount!");     
            return;
        }
           this.bal = this.bal+amount;
        System.out.println("Transaction Successful!");
     }

     int checkBalance(){                 //Universal checkBalance method
         return this.bal;
    }  

}

class saving extends Account{
    private final int minBal = 1000;

    saving(){
        super(); 
    }

    @Override
    void withdraw(int amount){

         if(amount<0) {
            System.out.println("Invalid amount!");
            return;
        }

        if((this.getBal() - amount) >= minBal){
            this.setBal(this.getBal() - amount);
            System.out.println("Transaction Successful!");
        }else{
            System.out.println("Can't go below Minimum Balance!");
            System.out.println("Minimum Balance must be 1000 Rupees!");
        }

    }

}

class current extends Account{

    current(){
        super();         // current account allows negative balance because they made for bussiness/cooperate
    }

    @Override
    void withdraw(int amount){       //Current acc for bussiness allows negative balance

         if(amount<0) {
            System.out.println("Invalid amount!");
            return;
        }

            this.setBal(this.getBal()-amount);
            System.out.println("Transaction Successful!"); 
    }

}