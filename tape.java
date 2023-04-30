package oops.Inh_2;

public class tape extends books{
    float ply;
    tape(String title,float price,int page,float ply){
        super(title,price,page);
        this.ply=ply;
    }
    void setdata(){
        super.setdata();
        System.out.println(" "+ply);
    }
}
