package oops.Vector.Inheritance;

public class rectangle extends fig {
    rectangle(int a,int b){
        super(a,b);
    }
    void area(){
        System.out.println("Area: "+a*b);
    }
}
