package prac_5;

public class Student{
    String Name;
    int GPA;
    String no;
    String Password;
    void check(String Name,int GPA,String no,String Password)throws exception{
        if(GPA>=10 && GPA<0){
             System.out.println("exception");
        }
        int year=Integer.parseInt(no.substring(2,4));
        String Dept=no.substring(4, 7);
        int rollno=Integer.parseInt(no.substring(7,10));
        if(no.substring(0, 2).equals("BE") && (year<=23 && year>=20) && (Dept.equals("CSU") || Dept.equals("ECU") || Dept.equals("ECE") || Dept.equals("ENU")) && (rollno>=1 && rollno<=250)){
            this.no=no;
           System.out.println("Succesful Id :"+no);
        }else{
            throw new exception("Wrong Enrollment");
        }
        char[] a=new char[Password.length()];
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        this.Password=Password;
        for(int i=0;i<Password.length();i++){
           a[i]=Password.charAt(i);
           if(a[i]>='A' && a[i]<='Z'){
            count1++;
           }
           if(a[i]>='a' && a[i]<='z'){
            count2++;
           }
           if(a[i]>='0' && a[i]<='9'){
            count3++;
           }
           if(a[i]=='@' || a[i]=='&'){
            count4++;
           }
        }
        if(count1==0 || count2==0 || count3==0 || count4==0){
            throw new exception("Invalid");
        }
        else{
            System.out.println("valid"+Password);
        }
    }
}
