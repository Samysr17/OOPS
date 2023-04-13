/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sam_2;

/**
 *
 * @author MJC
 */
public class three_shape {
    int radius;
    int length;
    int breadth;
    int height;
    double edge;
    void volume(int radius){
        double vol=(4*Math.PI*radius*radius*radius)/3;
        System.out.println("Volume of sphere is "+vol);
       
    }
    void volume(int length,int breadth,int height){
       double vol=length*breadth*height;
       System.out.println("Volume of cuboid is "+vol);
    }
     void volume(int radius,int height){
       double vol=Math.PI*radius*radius*height;
       System.out.println("Volume of CYLINDER is "+vol);
    }
    void volume(double edge){
        double vol_1=edge*edge*edge;
        System.out.println("Volume of cube is "+vol_1);
       
    } 
    
     
}
