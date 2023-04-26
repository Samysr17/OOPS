// package prac_2;

public class attendance {
    int day, month, year;
    Time in=new Time(0,0,0);
    Time out=new Time(0,0,0);
    attendance(int day,int month,int year,Time in,Time out){
        this.day=day;
        this.month=month;
        this.year=year;
        this.in=in;
        this.out=out;
    }
    void display(){
       System.out.println("  "); 
       System.out.print("Time in: ");
       in.display(in);
       System.out.println("  "); 
       System.out.print("Time out: ");
       out.display(out);
       System.out.println("  "); 
       System.out.println("Date: "+day+"/"+month+"/"+year);
    }
}
