package prac_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class customer {
    int idcount=1;
    String customerID;
    String c_name;
    product p1;
    int amount;
    int total=0;
    int index=0;
    product[] p_array = new product[5];
    customer(String c_name,product p1){
        this.c_name=c_name;
        this.customerID=generateCustomerId();
        this.p1=p1;
    }
     public String generateCustomerId() {
        String customerIdPre = "C";
        String customerIdSuff = String.format("%03d", idcount);
        idcount++;
        return customerIdPre + customerIdSuff;
    }
    void sell(int amount){
        if(p1.quantity>amount){
          total=p1.price*amount;
          p_array[index]=p1;
          int ans=p1.quantity - amount;
          product.after_selling(p_array[index],(ans));
          p_array[index].quantity = ans;
          index++;
        }else{
            System.out.println("Unavailable");
            return;
        }
    }
      void write(){
     String f_name="C:/Users/hp/Desktop/sales.txt";
     try(BufferedWriter writer=new BufferedWriter(new FileWriter(f_name,true))){
       writer.write("Name"+c_name);
       writer.newLine();
       writer.write("CustomerID"+customerID);
       writer.newLine();
       for(product itr:p_array){
       writer.write("Product ID"+itr.ID);
       writer.newLine();
       writer.write("Name:"+itr.Name);
       writer.newLine();
       writer.write("Quantity"+itr.quantity);
       writer.newLine();
       writer.write("Price"+itr.price);
       
       }
        writer.newLine();
       writer.write("Total"+total);
       writer.close();
      
       System.out.println("File has been written");
     }catch(IOException e){
        e.printStackTrace();
     }
      }


}
