public class Employee {
  int id,salary;
  String Name;
  String Designation;
  attendance a[]=new attendance[5];
  Time ans=new Time(0,0,0);
  Time ans_1=new Time(0,0,0);
  Time t1=new Time(10,10,00);
  Time t2=new Time(17,05,00);
  Time t3=new Time(10,10,00);
  Time t4=new Time(17,05,00);
  Time t5=new Time(10,10,00);
  Time t6=new Time(17,05,00);
  attendance s1=new attendance(1, 1, 2023, t1,t2);
  attendance s2=new attendance(2, 1, 2023, t3,t4);
  attendance s3=new attendance(3, 1, 2023, t5,t6);


    Employee(int id,int salary,String Name,String Designation){
      this.Name=Name;
      this.id=id;
      this.salary=salary;
      this.Designation=Designation;
      this.salary=salary;
    }
    void entry(){
     a[0]=s1;
     a[1]=s2;
     a[2]=s3;
    }
    void working_hours(){
      for(int i=0;i<3;i++){
        ans_1=t1.subtraction(a[i].in,a[i].out);
        ans=ans.addition(ans_1, ans);
      }
      System.out.println("Working Hours :"+ans.hour+" :"+ans.mints+" :"+ans.secs);
    }

    void display(){
      System.out.println("Name: "+Name);
      System.out.println("ID: "+id);
      System.out.println("Posn "+Designation);
      System.out.println("SAlary :"+salary);
    }
}
