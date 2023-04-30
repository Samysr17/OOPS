package oops.Vector.Inheritance;

public class main {
    public static void main(String[] args) {
        fig a[]=new fig[2];
        a[0]= new rectangle(1,2);
        a[1]=new tri(1,2);
        a[0].area();
        a[1].area();
    }
}
