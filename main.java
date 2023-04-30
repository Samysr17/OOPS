package oops.Inh_2;

public class main {
    
    public static void main(String[] args) {
        pubs a[]=new pubs[2];
        a[0]=new books("Book1", 10000, 2000020);
        a[1]=new tape("Music1", 3000, 220,1000000);
        a[0].setdata();
        a[1].setdata();
    }
}
