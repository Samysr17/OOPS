package prac_6;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class product {
    int ID;
    String Name;
    int quantity;
    int price;
    product(int ID,String Name,int quantity,int price){
       this.ID=ID;
       this.Name=Name;
       this.quantity=quantity;
       this.price=price;
    }
    void write_in_file(){
     String f_name="C:/Users/hp/Desktop/product.txt";
     try(BufferedWriter writer=new BufferedWriter(new FileWriter(f_name,true))){
       writer.write("Product ID"+ID);
       writer.newLine();
       writer.write("Name:"+Name);
       writer.newLine();
       writer.write("Quantity"+quantity);
       writer.newLine();
       writer.write("Price"+price);
       System.out.println("File has been written");
     }catch(IOException e){
        e.printStackTrace();
     }
    }
}
