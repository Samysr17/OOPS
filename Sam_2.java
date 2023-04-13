/*
Problem Statement:-
1(a)Stack class
1(b)Overloading 
    Create a class 3D shape overloaded method volume of different sphere cube cuboid and cylinder
 */
package sam_2;

/**
 *
 * @author MJC
 */
public class Sam_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       stack_class S1= new stack_class();
//       S1.is_empty();
//       S1.push(3);
//       S1.push(4);
//       S1.pop();
//       S1.push(5);
       three_shape S2=new three_shape();
       S2.volume(2);
       S2.volume(2,3,4);
       S2.volume(2,3);
       S2.volume(2.5);
    }
    //
}

