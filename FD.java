package prac_4;

public class FD extends Bank {
    int time;
    int amount;
    int days;
    static int count=55000;
    FD(int aadhar,String name,int time,int amount,int days){
        super(aadhar,name);
        this.time=time;
        this.amount=amount;
        this.days=days;
        acc_no=count++;
    }
    void update_interest(){
        System.out.println("acc_no "+acc_no);
       if(time<2){
        System.out.println("Amount: "+amount);
        amount+=amount*0.06;
        System.out.println("Amount: "+amount);
       }else if(time>2 && time<5){
        System.out.println("Amount: "+amount);
        amount+=amount*0.65;
        System.out.println("Amount: "+amount);
       }else{
        System.out.println("Amount: "+amount);
        amount+=amount*0.07;
        System.out.println("Amount: "+amount);
       }
    }
    void close_account(){
        double charge=0;
        if(days<time){
         charge=0.05*amount;
         amount-=charge;
         System.out.println("Balance: "+amount);
         System.out.println("Account closed");
        }
        else{
            System.out.println("Balance: "+amount);
            System.out.println("Account closed");
        }
    }
}
