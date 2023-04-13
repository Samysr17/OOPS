package oops.Bank;

public class main {
   public static void main(String[] args) {
        bank_acc sam=new bank_acc(1000,"xxx","sam");
        bank_acc bruno=new bank_acc(2000,"xyy","bruno");
        sam.withdrawal(500);
        bruno.deposit(5000);
        sam.transfer(bruno,500);
        sam.display();
        bruno.display();
    }
}
