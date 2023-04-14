package oops;

public class cir_class {
    double radius;
    cir_class(double radius){
        this.radius=radius;
    }
    void circ(){
        System.out.println("Circumference:"+Math.PI*2*radius);
    }
    void area(){
        System.out.println("Area:"+Math.PI*radius*radius);
    }
}
