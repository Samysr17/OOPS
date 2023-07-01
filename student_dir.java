package prac7;

import java.util.TreeSet;

public class student_dir implements Comparable{
    String Name;
    int roll;
    int Semester;
    String City;
    String Contact_no;
    TreeSet<student_dir>t=new TreeSet<>();
    
    student_dir(String Name,int roll,int Semester,String City,String Contact_no) throws Myexception{
      this.Name=Name;
      this.roll=roll;
      this.Semester=Semester;
      this.Contact_no=Contact_no;
      this.City=City;
      if(Name=="" || roll==0 || Semester==0 || Contact_no=="" || City==""){
        throw new Myexception("Invalid String");
      }
    }
    void add_stud(student_dir o){
        t.add(o);
    }
    void remove(student_dir o){
        t.remove(o);
    }
    void display(){
        for(student_dir itr:t){
            System.out.println("Name "+itr.Name);
            System.out.println("roll "+itr.roll);
            System.out.println("Semester "+itr.Semester);
             System.out.println("City "+itr.City);
            System.out.println("Contact Number "+itr.Contact_no);
           
        }
    }
    void display_cities(String req){
        System.out.println("City  "+req);
      for(student_dir itr:t){
        if(itr.City==req){
            System.out.println("Name :"+itr.Name);
        }
      }
    }
    @Override
    public int compareTo(Object o) {
        student_dir comp=(student_dir)o;
        int ans;
        ans=comp.Semester-Semester;
        if(ans==0){
            ans=comp.roll-roll;
        }
        return ans;
    }
    
}
