package oops.Bank;

public class bank_acc {
    int balance;
    String acc_no;
    String Name;
    int amount;
    bank_acc(int balance,String acc_no,String Name){
        this.balance=balance;
        this.acc_no=acc_no;
        this.Name=Name;
    }
    void withdrawal(int amount){
        if(amount>balance){
            System.out.println("Not enough Balance");
        }else{
            System.out.println("Withdrawal :"+amount);
            System.out.println("Balance: "+(balance-amount));            
        }
    }
    void deposit(int amount){
        System.out.println("Deposit: "+amount);
        System.out.println("Balance: "+(balance+amount));  
    }
    void transfer(bank_acc o1,int amount){
        balance-=amount;
        o1.balance+=amount;
        System.out.println("Balance of taker "+balance);
    }
    void display(){
        System.out.println("Name : "+(Name));     
        System.out.println("Balance:"+(balance));
        System.out.println("Account no: "+(acc_no));   
        
    }
}
