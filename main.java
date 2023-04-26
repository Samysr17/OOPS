// package prac_2;

public class main {
    public static void main(String[] args) {
        Time s1=new Time(10,10,00);
        Time s2=new Time(17,05,00);
         s1.addition(s1,s2);
         s1.subtraction(s1,s2);
        attendance s3=new attendance (14,2,2022,s1,s2);
         s3.display();
        Employee s4=new Employee(2, 20000, "Samrat", "SDE");
        s4.display();
        s4.entry();
        s4.working_hours();
      
      }
}
