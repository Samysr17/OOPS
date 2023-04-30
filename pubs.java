package oops.Inh_2;

public class pubs {
    String title;
    float price;
    pubs(String title,float price){
        this.title=title;
        this.price=price;
        System.out.println(" "+title+" "+price);
    }
    void setdata(){
      System.out.println(" "+title+" "+price);
    }
}
