package prac_4;
public class main{
public static void main(String[] args){
    Save_acc s1=new Save_acc(11,"Samrat",50000);
    s1.update_interest();
    s1.withdraw(1000);
    FD s2=new FD(12,"Samrat",3,1000,1);
    s2.update_interest();
    s2.close_account();
    Save_acc s3=new Save_acc(11,"Samrat",50000);
    s3.update_interest();
    s3.withdraw(1000);
    FD s4=new FD(12,"Samrat",3,1000,1);
    s4.update_interest();
    s4.close_account();
}
}