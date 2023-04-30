package oops.Inh_2;

public class books extends pubs {
    int page;
    books(String title,float price,int page){
        super(title,price);
        this.page=page;
    }
   
    void setdata(){
        super.setdata();
        System.out.println(" "+page);
    }
}
