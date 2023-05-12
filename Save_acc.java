package prac_4;

public class Save_acc extends Bank implements Debit{
    int amount;
    int withdraw;
    static int count=11001;
    Save_acc(int aadhar,String name,int amount){
        super(aadhar,name);
        this.amount=amount;
        acc_no=count++;
    }
    
    public void withdraw(int withdraw){
        amount-=withdraw;
        System.out.println("Amount: "+amount);
    }

    
}
