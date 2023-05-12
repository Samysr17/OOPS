package prac_4;

public class Bank {
    int acc_no;
    int aadhar;
    String name;
    double ROI;
    int balance;
    int amount;
    Bank(int aadhar,String name){
        this.aadhar=aadhar;
        this.name=name;
    }
    void open_account(double ROI,int balance){
        this.ROI=ROI;
        this.balance=balance;
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Balance: "+balance);
        System.out.println("Deposited: "+amount);
        System.out.println("Balance: "+balance);
    }
    void close_account(){
        System.out.println("Balance: "+balance);
        balance=0;
        System.out.println("Balance: "+balance);
    }
    void update_interest(){
        System.out.println("Balance: "+balance);
        balance+=balance*0.04;
        System.out.println("Balance: "+balance);
    }
    
}
