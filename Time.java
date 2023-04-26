//  package prac_2;

public class Time {
    int hour,mints,secs;
    
    Time(int hour,int mints,int secs){
      this.hour=hour;
      this.mints=mints;
      this.secs=secs;
    }
    Time a,b;
    Time addition(Time a,Time b){
        Time c=new Time(0,0,0);
        c.hour=a.hour+b.hour;
        c.mints=a.mints+b.mints;
        c.secs=a.secs+b.secs;
        if(c.mints>60){
            c.hour++;
            c.mints-=60;
        }
        if(c.secs>60){
            c.mints++;
            c.secs-=60;
        }
       return c;
    }
    Time subtraction(Time a,Time b){
         Time c=new Time(0,0,0);
        Time max,min;
        if(b.hour>a.hour){
            max=b;
            min=a;
        }else{
            max=a;
            min=b;
        }
        c.hour=max.hour-min.hour;
        if(max.mints<min.mints){
            c.hour--;
            c.mints=60-max.mints;
        }else{
            c.mints=max.mints-min.mints;
        }
        if(min.secs>max.secs){
            c.mints--;
            c.secs=60-max.secs;
        }else{
            c.secs=max.secs-min.secs;
        }
       return c;
    }
    void display(Time c){
        
        System.out.print("  "+c.hour);
        System.out.print(" : "+c.mints);
        System.out.print(" : "+c.secs);
    }
}
